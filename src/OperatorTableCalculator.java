import java.util.Scanner;

public class OperatorTableCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 수: ");
        double first = scanner.nextDouble();
        System.out.print("두 번째 수: ");
        double second = scanner.nextDouble();

        boolean canDivide = second != 0;

        double sum = first + second;
        double difference = first - second;
        double product = first * second;
        String quotientText = canDivide ? String.valueOf(first / second) : "세컨드가 0이라 계산못합니다";
        String remainderText = canDivide ? String.valueOf(first % second) : "세컨드가 0이라 계산못합니다.";

        boolean sameValues = first == second;
        boolean firstIsGreater = first > second;
        System.out.println("덧셈: " + sum);
        System.out.println("뺄셈: " + difference);
        System.out.println("곱셈: " + product);
        System.out.println("나눗셈: " + quotientText);
        System.out.println("나머지: " + remainderText);
        System.out.println("두 값이 같은가: " + sameValues);
        System.out.println("첫 값이 더 큰가: " + firstIsGreater);
        scanner.close();
    }
}
