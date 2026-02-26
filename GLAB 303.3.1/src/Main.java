
import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        String vowels = "a::b::c::d:e";

        String[] result = vowels.split("::");

        System.out.println("results = " + Arrays.toString(result));

    }
}
