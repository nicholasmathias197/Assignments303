import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {

        Object[] mixedArray = new Object[5];


        mixedArray[0] = 42;
        mixedArray[1] = "Hello";
        mixedArray[2] = "World";
        mixedArray[3] = "Java";
        mixedArray[4] = 3.14;


        System.out.println("Array with mixed data types:");
        System.out.println(Arrays.toString(mixedArray));


        System.out.println("\nElements with their types:");
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.println("Index " + i + ": " + mixedArray[i] +
                    " (Type: " + mixedArray[i].getClass().getSimpleName() + ")");
        }
    }
}