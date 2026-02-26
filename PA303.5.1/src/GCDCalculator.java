import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("GCD Calculator - Test Multiple Pairs");
        System.out.println("=====================================");

        while (true) {
            System.out.print("\nEnter first positive integer (0 to quit): ");
            int n1 = scanner.nextInt();

            if (n1 == 0) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter second positive integer: ");
            int n2 = scanner.nextInt();

            if (n1 < 0 || n2 < 0) {
                System.out.println("Please enter positive integers only.");
                continue;
            }

            int gcd = findGCD(n1, n2);
            System.out.println("GCD(" + n1 + ", " + n2 + ") = " + gcd);
        }

        scanner.close();
    }

    public static int findGCD(int n1, int n2) {
        int gcd = 1;
        int limit = Math.min(n1, n2);

        for (int k = 2; k <= limit; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }

        return gcd;
    }
}