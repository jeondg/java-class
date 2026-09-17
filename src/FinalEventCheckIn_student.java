import java.util.Scanner;

class StudentEntry {
    String studentId;
    String name;
}

public class FinalEventCheckIn_student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentEntry[] entries = new StudentEntry[5];

        while (true) {
            System.out.println("\n[취업 특강 접수]");
            System.out.println("1 신청  2 명단  3 취소  4 현황  0 종료");
            System.out.print("선택: ");
            String menu = scanner.nextLine().trim();

            if (menu.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (menu) {
                case "1":
                    System.out.print("학번: ");
                    String studentId = scanner.nextLine().trim();
                    System.out.print("이름: ");
                    String name = scanner.nextLine().trim();

                    // TODO 1. 빈 학번이나 빈 이름은 거절하세요.
                    // TODO 2. 같은 학번이 이미 있는지 배열 전체를 확인하세요.
                    // TODO 3. null인 첫 칸을 찾고 StudentEntry 객체를 저장하세요.
                    // TODO 4. 다섯 칸이 모두 찼다면 정원 마감을 출력하세요.
                    if (studentId.isEmpty() || name.isEmpty()) {
                        System.out.println("학번과 이름을 모두 입력");
                        break;
                    }

                    boolean duplicate = false; //중복된것확인
                    for (StudentEntry entry : entries) {
                        if (entry != null && entry.studentId.equals(studentId)) {
                            duplicate = true; // 객체자체가 존재하는지 확인하고 학번이 기존학번과 동일하면 중복인것이다.
                            break;
                        }
                    }

                    if (duplicate) { // 중복이면 이미 신청처리
                        System.out.println("이미 신청한 학생");
                        break;
                    }

                    int emptyIndex = -1;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] == null) { // 빈칸인지확인해야함
                            emptyIndex = i;
                            break;
                        }
                    }

                    if (emptyIndex == -1) { // 남은곳이 없다면 저장없이 빠져나와
                        System.out.println("정원마감");
                        break;
                    }

                    StudentEntry newEntry = new StudentEntry();
                    newEntry.studentId = studentId;
                    newEntry.name = name;
                    entries[emptyIndex] = newEntry;
                    System.out.println(name + "학생 신청 완료");
                    break;


                case "2":
                    // TODO 5. null을 건너뛰며 위치, 학번, 이름을 출력하세요.
                    // 아무도 없으면 "등록된 신청자가 없습니다."를 출력하세요.
                    int displayed = 0;
                    int indexing = 0;
                    for(int i = 0; i<entries.length; i++){ // 빈자리 확인해줘야하나 싶어서 이렇게 표현했습니다
                        if(entries[i]!=null){
                            System.out.println("위치 : " + (indexing+1) + " 학번 : " + entries[i].studentId + " 이름 : " + entries[i].name);
                            // displayed로 표현했습니다.
                            displayed++;
                        }else{
                            System.out.println((indexing+1) + "번은 빈자리입니다.");
                            indexing++;
                        }
                    }

                    if(displayed == 0){
                        System.out.println("등록한 신청자가 없습니다.");
                    }

                    break;

                case "3":
                    System.out.print("취소할 학번: ");
                    String cancelId = scanner.nextLine().trim();
                    // TODO 6. 학번을 찾아 해당 칸에 null을 넣으세요.
                    // 없는 학번이라면 그 사실을 알려 주세요.
                    int canceledIndex = -1;
                    for (int i = 0; i<entries.length; i++){
                        if(entries[i]!=null && entries[i].studentId.equals(cancelId)){
                            canceledIndex = i;
                        }

                    }
                    if(canceledIndex == -1){
                        System.out.println("해당 학생의 신청이 없음");
                    } else{
                        String canceledName = entries[canceledIndex].name;
                        entries[canceledIndex] = null;
                        System.out.println(canceledName + "학생의 신청을 취소");
                    }
                    break;

                case "4":
                    // TODO 7. null이 아닌 칸을 세어 현재 인원과 남은 자리를 출력하세요.
                    int count = 0;
                    indexing = 0; // 0으로초기화
                    for(int i = 0; i<entries.length; i++){
                        if(entries[i]!=null){//테스트순서 5번항목에서 빈자리가 확인되는가의 뜻이 빈자의 위치를 물어보시는것같아서 이렇게 표현했습니다.
                            System.out.println("위치 : " + (indexing+1) + " 학번 : " + entries[i].studentId + " 이름 : " + entries[i].name);
                            indexing++;
                            count++;
                        }else{
                            System.out.println((indexing+1) + "번은 빈자리입니다.");
                            indexing++;
                        }
                    }
                    System.out.println("신청 인원:"+count+"명");
                    System.out.println("남은 자리:"+(entries.length - count) + "명");
                    break;

                default:
                    System.out.println("0부터 4까지 선택하세요.");
            }
        }
    }
}