public class DoubleDivide {
    public static void main(String[] args) {
        double num1 = 15.7;
        double num2 = 3.2;

        double result = num1 / num2;

        System.out.println("Division result (double): " + result);

        int castResult = (int) result;

        System.out.println("Division result (cast to int): " + castResult);
    }
}
