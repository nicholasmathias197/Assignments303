import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        String[] colors = {"red", "green", "blue", "yellow"};


        System.out.println("Array length: " + colors.length);


        String[] colorsCopy = colors.clone();


        System.out.println("Original array: " + Arrays.toString(colors));
        System.out.println("Copied array: " + Arrays.toString(colorsCopy));
    }
}