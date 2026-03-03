import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("First element (index 0): " + numbers[0]);
        System.out.println("Last element (index " + (numbers.length - 1) + "): " + numbers[numbers.length - 1]);


        try {
            System.out.println("\nAttempting to access index = length (" + numbers.length + ")...");
            System.out.println(numbers[numbers.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Cannot access index " + numbers.length + " - array only has indices 0 to " + (numbers.length - 1));
        }


        try {
            System.out.println("\nAttempting to assign value to index 5...");
            numbers[5] = 60;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Cannot assign to index 5 - array only has indices 0 to " + (numbers.length - 1));
        }
    }
}