import java.util.Scanner;

public class FinalNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO 1: Math.random()을 이용해 게임에서 사용할 정답을 만든다.
        int answer = (int)(Math.random()*100)+1;
        int attempts = 0;

        System.out.println("===== 숫자 맞히기 게임 =====");
        System.out.println("컴퓨터가 1부터 100 사이의 숫자를 정했습니다.");

        while (true) {
            System.out.print("숫자 입력(1~100): ");
            int guess = scanner.nextInt();


            // TODO 2: 게임에서 인정하지 않는 입력을 걸러내는 조건을 작성한다.
            if (guess < 1 || guess > 100) {
                System.out.println("1~100만 입력하세요.");
                continue;
            }

            // TODO 3: 정상적으로 입력한 경우에만 시도 횟수를 반영한다.
            if(guess>=1 && guess<=100){
                attempts += 1;
            }

            // TODO 4: UP을 출력해야 하는 조건을 작성한다.
            if (answer > guess) {
                System.out.println("UP: 더 큰 수입니다.");

                // TODO 5: DOWN을 출력해야 하는 조건을 작성한다.
            } else if (answer < guess) {
                System.out.println("DOWN: 더 작은 수입니다.");
            } else {
                System.out.println("정답입니다.");
                System.out.println("시도 횟수: " + attempts + "회");
                break;
            }
        }

        System.out.println("게임을 종료합니다.");
        scanner.close();
    }
}