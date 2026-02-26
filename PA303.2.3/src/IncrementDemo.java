public class IncrementDemo {
    public static void main(String[] args) {

        System.out.println("=== METHOD 1: Postfix increment operator (x++) ===\n");
        int x = 5;
        System.out.println("Starting value: " + x);
        x++;
        System.out.println("After first increment: " + x);
        x++;
        System.out.println("After second increment: " + x);
        x++;
        System.out.println("After third increment: " + x);

        System.out.println("\n=== METHOD 2: Addition assignment operator (+=) ===\n");
        int y = 5;
        System.out.println("Starting value: " + y);
        y += 1;
        System.out.println("After first increment: " + y);
        y += 1;
        System.out.println("After second increment: " + y);
        y += 1;
        System.out.println("After third increment: " + y);

        System.out.println("\n=== METHOD 3: Addition operator (x = x + 1) ===\n");
        int z = 5;
        System.out.println("Starting value: " + z);
        z = z + 1;
        System.out.println("After first increment: " + z);
        z = z + 1;
        System.out.println("After second increment: " + z);
        z = z + 1;
        System.out.println("After third increment: " + z);
    }
}