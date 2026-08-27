import java.util.Scanner;

public class DeveloperProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름: ");
        String name = scanner.nextLine().trim();

        System.out.print("희망 직무: ");
        String role = scanner.nextLine().trim();

        System.out.print("GitHub 주소: ");
        String githubUrl = scanner.nextLine().trim();

        System.out.print("Java 학습 개월 수: ");
        String monthsText = scanner.nextLine().trim();
        int studyMonths = Integer.parseInt(monthsText);

        System.out.print("프로젝트 수: ");
        int projectCount = Integer.parseInt(
                scanner.nextLine().trim());

        System.out.print("즉시 취업 가능(true/false): ");
        boolean available = Boolean.parseBoolean(
                scanner.nextLine().trim());

        String introduction = scanner.nextLine().trim();

        scanner.close();

        System.out.println("\n개발자 프로필");
        System.out.printf("이름: %s%n", name);
        System.out.printf("희망 직무: %s%n", role);
        System.out.printf("GitHub: %s%n", githubUrl);
        System.out.printf("학습 기간: %d개월%n", studyMonths);
        System.out.printf("프로젝트: %d개%n", projectCount);
        System.out.printf("즉시 가능: %b%n", available);
        System.out.printf("자기소개: %s%n", introduction);

    }
}
