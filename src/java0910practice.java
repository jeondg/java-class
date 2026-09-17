import java.util.Scanner;

public class java0910practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int completedCount = 0;
        int cancelledCount = 0;
        int salesTotal = 0;
        for (int order = 1; order <= 5; order++) {
            System.out.print(order + "번 주문 금액을 입력하세요. 취소 주문은 -1: ");
            int amount = scanner.nextInt();
            if (amount == -1) {
                cancelledCount++;
                System.out.println("취소 주문은 매출 계산에서 제외합니다.");
                continue;
            }
            if (amount < 0) {
                System.out.println("잘못된 금액은 처리하지 않습니다.");
                continue;
            }
            completedCount++;
            salesTotal += amount;
        }
        System.out.println("완료 주문: " + completedCount
                + "건");
        System.out.println("취소 주문: " + cancelledCount
                + "건");
        System.out.println("매출 합계: " + salesTotal +
                "원");
        scanner.close();
    }
}
