import java.util.Scanner;

public class FinalStudentScoreStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== 학생 성적 통계 =====");
        System.out.print("학생 수: ");
        int studentCount = scanner.nextInt();

        if (studentCount <= 0) {
            System.out.println("1명 이상 입력하세요.");
        } else {
            int validCount = 0;
            int totalScore = 0;

            // TODO 1: 점수 범위를 생각해 최고점과 최저점의 초기값을 정한다.
            int maxScore = 0;
            int minScore = 100;

            int aCount = 0;
            int bCount = 0;
            int cCount = 0;
            int dCount = 0;
            int fCount = 0;

            // TODO 2: 필요한 점수를 모두 입력할 때까지 반복하는 조건을 작성한다.
            while (validCount < studentCount) {
                // TODO 3: 화면에 보여줄 학생 번호를 계산한다.
                int number = validCount+1; // 일부로 1번 학생부터를 표현하고싶어서 1을 추가함
                System.out.print(number + "번 점수: ");
                int score = scanner.nextInt();

                // TODO 4: 점수로 인정할 수 없는 입력을 걸러내는 조건을 작성한다.
                if (score <0 || score > 100) {
                    System.out.println("0~100만 입력하세요.");
                    continue;
                }

                // TODO 5: 이번 점수를 기존 합계에 반영한다.
                totalScore += score;

                // TODO 6: 최고점과 최저점을 바꿔야 하는 조건을 각각 작성한다.
                if (score > maxScore) {
                    maxScore = score;
                }

                if (score < minScore) {
                    minScore = score;
                }

                // TODO 7: 위에 제시된 등급 기준을 if-else if 조건으로 작성한다.
                if (score>=90) {
                    aCount++;
                } else if (score>=80) {
                    bCount++;
                } else if (score>=70) {
                    cCount++;
                } else if (score>=60) {
                    dCount++;
                } else {
                    fCount++;
                }

                // TODO 8: 정상 점수 한 개의 처리가 끝났음을 반영한다.
                validCount += 1;
            }

            // TODO 9: 소수점이 사라지지 않도록 평균을 계산한다.
            double average = (double)totalScore/studentCount;

            System.out.println("\n===== 통계 결과 =====");
            System.out.println("합계: " + totalScore);
            System.out.printf("평균: %.1f%n", average);
            System.out.println("최고점: " + maxScore);
            System.out.println("최저점: " + minScore);
            System.out.println("A: " + aCount + "명");
            System.out.println("B: " + bCount + "명");
            System.out.println("C: " + cCount + "명");
            System.out.println("D: " + dCount + "명");
            System.out.println("F: " + fCount + "명");
        }

        scanner.close();
    }
}