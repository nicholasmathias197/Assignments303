import java.util.Scanner;
import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("How many favorite things do you have? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] favoriteThings = new String[count];


        System.out.println("Enter your " + count + " favorite things:");
        for (int i = 0; i < count; i++) {
            System.out.print("Favorite thing #" + (i + 1) + ": ");
            favoriteThings[i] = scanner.nextLine();
        }


        System.out.println("\nYour favorite things are:");
        System.out.println(Arrays.toString(favoriteThings));


        System.out.println("\nNumbered list:");
        for (int i = 0; i < favoriteThings.length; i++) {
            System.out.println((i + 1) + ". " + favoriteThings[i]);
        }

        scanner.close();
    }
}