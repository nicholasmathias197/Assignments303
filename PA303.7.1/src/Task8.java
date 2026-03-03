import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};

        System.out.println("Original array: " + Arrays.toString(words));


        String temp = words[0];
        words[0] = words[2];
        words[2] = temp;

        System.out.println("Array after swapping first and middle elements:");
        System.out.println(Arrays.toString(words));
    }
}