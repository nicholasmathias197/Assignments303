public class RightShiftDemo {
    public static void main(String[] args) {


        System.out.println("x = 150");
        int x = 150;
        System.out.println("Binary: " + Integer.toBinaryString(x));

        // Predict: 150 >> 2 = 37
        x = x >> 2;
        System.out.println("After >> 2: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println();


        System.out.println("x = 225");
        x = 225;
        System.out.println("Binary: " + Integer.toBinaryString(x));

        // Predict: 225 >> 2 = 56
        x = x >> 2;
        System.out.println("After >> 2: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println();


        System.out.println("x = 1555");
        x = 1555;
        System.out.println("Binary: " + Integer.toBinaryString(x));

        // Predict: 1555 >> 2 = 388
        x = x >> 2;
        System.out.println("After >> 2: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println();


        System.out.println("x = 32456");
        x = 32456;
        System.out.println("Binary: " + Integer.toBinaryString(x));

        // Predict: 32456 >> 2 = 8114
        x = x >> 2;
        System.out.println("After >> 2: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));
    }
}