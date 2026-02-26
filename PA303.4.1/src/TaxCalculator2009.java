import java.util.Scanner;

public class TaxCalculator2009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},  // Single
                {16700, 67900, 137050, 208850, 372950}, // Married Joint
                {8350, 33950, 68525, 104425, 186475},   // Married Separate
                {11950, 45500, 117450, 190200, 372950}  // Head of Household
        };
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        String[] statusNames = {"Single", "Married Filing Jointly",
                "Married Filing Separately", "Head of Household"};


        System.out.println("Filing Status: 1-Single, 2-Married Joint, 3-Married Separate, 4-Head of Household");
        System.out.print("Enter status (1-4): ");
        int status = scanner.nextInt() - 1;

        System.out.print("Enter taxable income: $");
        double income = scanner.nextDouble();


        if (status < 0 || status > 3 || income < 0) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }

        double tax = 0;
        double prevLimit = 0;
        double[] currentBracket = brackets[status];

        for (int i = 0; i < currentBracket.length; i++) {
            if (income > currentBracket[i]) {
                tax += (currentBracket[i] - prevLimit) * rates[i];
                prevLimit = currentBracket[i];
            } else {
                tax += (income - prevLimit) * rates[i];
                break;
            }
        }


        if (income > currentBracket[currentBracket.length - 1]) {
            tax += (income - currentBracket[currentBracket.length - 1]) * rates[rates.length - 1];
        }

        // Display result
        System.out.println("\n--- Results ---");
        System.out.println("Status: " + statusNames[status]);
        System.out.printf("Income: $%,.2f%n", income);
        System.out.printf("Tax: $%,.2f%n", tax);

        scanner.close();
    }
}