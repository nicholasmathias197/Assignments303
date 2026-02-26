public class DivisionExample {
    public static void main(String[] args) {

        int x = 5;
        int y = 6;

        int q = y / x;
        System.out.println("q = y/x (integer division): " + q);

        System.out.println("\n--- Correct approach ---");
        double doubleQ = (double) y / x;
        System.out.println("doubleQ = (double) y / x: " + doubleQ);


        double yAsDouble = (double) y;
        double anotherQ = yAsDouble / x;
        System.out.println("anotherQ = (double) y / x: " + anotherQ);

        System.out.println("\n--- Comparison ---");
        int intResult = y / x;
        double doubleResult = (double) y / x;
        System.out.println("Integer division (6/5): " + intResult);
        System.out.println("Double division (6.0/5): " + doubleResult);
    }
}