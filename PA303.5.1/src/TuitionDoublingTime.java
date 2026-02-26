public class TuitionDoublingTime {
    public static void main(String[] args) {
        double tuition = 10000;  // Initial tuition
        double target = 20000;   // Target tuition (double)
        double rate = 0.07;      // 7% annual increase

        int years = 0;

        System.out.println("Year 0: Tuition = $" + tuition);

        while (tuition < target) {
            tuition = tuition * (1 + rate);  // Increase by 7%
            years++;
            System.out.printf("Year %d: Tuition = $%.2f%n", years, tuition);
        }

        System.out.println("\n--- Result ---");
        System.out.printf("It will take %d years for tuition to double.%n", years);
        System.out.printf("Final tuition after %d years: $%.2f%n", years, tuition);
    }
}
