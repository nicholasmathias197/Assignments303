import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        int[] numbers = new int[5];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }


        System.out.println("Array after assigning loop control variable multiplied by 2:");
        System.out.println(Arrays.toString(numbers));
    }
}