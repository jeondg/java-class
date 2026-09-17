import java.util.Arrays;
import java.util.Scanner;

public class java0917practice {
    public static void main(String[] args) {

        enum OrderStatus {
            PAYMENT,
            PREPARING,
            SHIPPING,
            COMPLETED
        }
        OrderStatus status = OrderStatus.SHIPPING;
        System.out.println(status);
        String message = switch (status) {
            case PAYMENT -> "결제 확인";
            case PREPARING -> "상품 준비";
            case SHIPPING -> "배송 중";
            case COMPLETED -> "배송 완료";
        };
        System.out.println(message);
    }
}
