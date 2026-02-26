public class BitwiseOrDemo {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        int z;

        // Show binary with padding for better visualization
        System.out.println("Bitwise OR Demonstration:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();

        System.out.println("Binary representation (padded to 5 bits):");
        System.out.println("x: " + String.format("%5s", Integer.toBinaryString(x)).replace(' ', '0'));
        System.out.println("y: " + String.format("%5s", Integer.toBinaryString(y)).replace(' ', '0'));
        System.out.println("|:  " + String.format("%5s", Integer.toBinaryString(x | y)).replace(' ', '0'));
        System.out.println();


        z = x | y;

        System.out.println("Prediction: 7 | 17 = 23");
        System.out.println("Actual result: " + z);
        System.out.println("Binary result: " + Integer.toBinaryString(z));


    }
}