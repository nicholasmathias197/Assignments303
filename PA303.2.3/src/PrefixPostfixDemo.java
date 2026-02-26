public class PrefixPostfixDemo {
    public static void main(String[] args) {


        int x = 5;
        int y = 8;
        int sum;

        System.out.println("Initial values: x = " + x + ", y = " + y);


        sum = ++x + y;

        System.out.println("After ++x + y:");
        System.out.println("sum = " + sum);
        System.out.println("x is now: " + x);
        System.out.println("y is still: " + y);
        System.out.println("Explanation: ++x increments x to 6, then adds to y (8) = 14");




        x = 5;
        y = 8;

        System.out.println("Initial values: x = " + x + ", y = " + y);


        sum = x++ + y;

        System.out.println("After x++ + y:");
        System.out.println("sum = " + sum);
        System.out.println("x is now: " + x);
        System.out.println("y is still: " + y);
        System.out.println("Explanation: x++ uses original x (5) added to y (8) = 13, then increments x to 6");




        x = 5;
        System.out.println("Starting with x = 5, y = 8\n");

        System.out.println("PREFIX (++x):");
        System.out.println("  Step 1: Increment x from 5 to 6");
        System.out.println("  Step 2: Calculate 6 + 8 = 14");
        System.out.println("  Result: sum = 14, x = 6\n");

        System.out.println("POSTFIX (x++):");
        System.out.println("  Step 1: Calculate 5 + 8 = 13 (using original x)");
        System.out.println("  Step 2: Increment x from 5 to 6");
        System.out.println("  Result: sum = 13, x = 6");
    }
}