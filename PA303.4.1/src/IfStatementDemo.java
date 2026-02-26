public class IfStatementDemo {
    public static void main(String[] args) {

        System.out.println("First test: x = 7");


        int x = 7;

        System.out.println("x = " + x);


        if (x < 10) {
            System.out.println("Less than 10");
        }

        System.out.println("Second test: x = 15");


        x = 15;

        System.out.println("x = " + x);


        if (x < 10) {
            System.out.println("Less than 10");
        }

        System.out.println("\nProgram ended - nothing printed after x = 15 because condition was false");
    }
}
