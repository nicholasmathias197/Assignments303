public class Task1 {
    public static void main(String[] args) {

        int[] numbers = new int[3];


        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;


        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}