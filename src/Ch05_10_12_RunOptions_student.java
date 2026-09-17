public class Ch05_10_12_RunOptions_student {
    enum RegistrationStatus { OPEN, CLOSED }

    public static void main(String[] args) {
        // TODO 1. 인자가 없으면 사용법을 출력하고 프로그램을 끝내세요.
        if(args.length==0){
            System.out.println("이름을 입력하세요"); return;
        }

        RegistrationStatus status = RegistrationStatus.OPEN;
        int count = 0;
        // TODO 2. 향상된 for문으로 모든 이름을 출력하고 count를 증가시키세요.
        // 형식: 신청자 1: 김서윤
        for(String name : args){

            count ++;
            System.out.println(name + count);
        }

        System.out.println("신청 인원: " + count);
        System.out.println("접수 상태: " + status);
        // TODO 3. status가 CLOSED일 때만 마감 안내를 출력해 보세요.
        if(status == RegistrationStatus.CLOSED){
            System.out.println("마감");
        }
    }
}