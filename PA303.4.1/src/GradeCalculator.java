import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your score (0-100): ");


        if (scanner.hasNextInt()) {
            int score = scanner.nextInt();


            if (score < 0 || score > 100) {
                System.out.println("Score out of range");
            } else {

                System.out.print("Your grade is: ");

                if (score >= 90) {
                    System.out.println("A");
                } else if (score >= 80) {
                    System.out.println("B");
                } else if (score >= 70) {
                    System.out.println("C");
                } else if (score >= 60) {
                    System.out.println("D");
                } else {
                    System.out.println("F");
                }
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }


        scanner.close();
    }
}