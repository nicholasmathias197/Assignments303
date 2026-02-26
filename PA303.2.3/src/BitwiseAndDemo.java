public class BitwiseAndDemo {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        int z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();

        System.out.println("x: " + String.format("%5s", Integer.toBinaryString(x)).replace(' ', '0'));
        System.out.println("y: " + String.format("%5s", Integer.toBinaryString(y)).replace(' ', '0'));
        System.out.println("&:  " + String.format("%5s", Integer.toBinaryString(x & y)).replace(' ', '0'));
        System.out.println();

        z = x & y;

        System.out.println("Prediction was correct: 7 & 17 = " + z);
        System.out.println("Binary result: " + Integer.toBinaryString(z));
    }
}