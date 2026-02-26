public class LeftShiftDemo {
    public static void main(String[] args) {

        System.out.println("=== Testing with x = 2 ===");
        int x = 2;
        System.out.println("Original x: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        // Predict: 2 << 1 = 4 (binary: 100)
        x = x << 1;
        System.out.println("After left shift by 1:");
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println();


        System.out.println("=== Testing with x = 9 ===");
        x = 9;
        System.out.println("Original x: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        // Predict: 9 << 1 = 18 (binary: 10010)
        x = x << 1;
        System.out.println("After left shift by 1:");
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println();


        System.out.println("=== Testing with x = 17 ===");
        x = 17;
        System.out.println("Original x: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        // Predict: 17 << 1 = 34 (binary: 100010)
        x = x << 1;
        System.out.println("After left shift by 1:");
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println();


        System.out.println("=== Testing with x = 88 ===");
        x = 88;
        System.out.println("Original x: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        // Predict: 88 << 1 = 176 (binary: 10110000)
        x = x << 1;
        System.out.println("After left shift by 1:");
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println();


        System.out.println("=== Bonus: Multiple shifts with x = 5 ===");
        x = 5;
        System.out.println("Original x = 5");
        System.out.println("Binary: " + Integer.toBinaryString(x));

        x = x << 1;
        System.out.println("After 1 shift: " + x + " (binary: " + Integer.toBinaryString(x) + ")");

        x = x << 1;
        System.out.println("After 2 shifts: " + x + " (binary: " + Integer.toBinaryString(x) + ")");

        x = x << 1;
        System.out.println("After 3 shifts: " + x + " (binary: " + Integer.toBinaryString(x) + ")");
    }
}
