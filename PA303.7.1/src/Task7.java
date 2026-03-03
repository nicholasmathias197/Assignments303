public class Task7 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements (except middle index 2):");


        for (int i = 0; i < numbers.length; i++) {
            if (i != 2) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        }
    }
}