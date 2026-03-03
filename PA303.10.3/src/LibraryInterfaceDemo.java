public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        System.out.println("========== TEST CASE #1: KidUser ==========");

        // Test case #1 - KidUser with age 10
        System.out.println("\n--- KidUser with age 10 ---");
        KidUser kidUser1 = new KidUser(10, "Kids");
        kidUser1.registerAccount();
        kidUser1.requestBook();

        // Test case #1 - KidUser with age 18
        System.out.println("\n--- KidUser with age 18 ---");
        KidUser kidUser2 = new KidUser(18, "Fiction");
        kidUser2.registerAccount();
        kidUser2.requestBook();

        // Additional test for KidUser - age 10 but requesting Fiction book
        System.out.println("\n--- KidUser with age 10 requesting Fiction ---");
        KidUser kidUser3 = new KidUser(10, "Fiction");
        kidUser3.registerAccount();
        kidUser3.requestBook();

        System.out.println("\n========== TEST CASE #2: AdultUser ==========");

        // Test case #2 - AdultUser with age 5
        System.out.println("\n--- AdultUser with age 5 ---");
        AdultUser adultUser1 = new AdultUser(5, "Kids");
        adultUser1.registerAccount();
        adultUser1.requestBook();

        // Test case #2 - AdultUser with age 23
        System.out.println("\n--- AdultUser with age 23 ---");
        AdultUser adultUser2 = new AdultUser(23, "Fiction");
        adultUser2.registerAccount();
        adultUser2.requestBook();

        // Additional test for AdultUser - age 23 but requesting Kids book
        System.out.println("\n--- AdultUser with age 23 requesting Kids ---");
        AdultUser adultUser3 = new AdultUser(23, "Kids");
        adultUser3.registerAccount();
        adultUser3.requestBook();

        System.out.println("\n========== DEMONSTRATING POLYMORPHISM ==========");

        // Demonstrating polymorphism using the interface
        LibraryUser user1 = new KidUser(8, "Kids");
        LibraryUser user2 = new KidUser(15, "Fiction");
        LibraryUser user3 = new AdultUser(25, "Fiction");
        LibraryUser user4 = new AdultUser(10, "Kids");

        System.out.println("\n--- Polymorphic behavior ---");
        user1.registerAccount();
        user1.requestBook();

        System.out.println();
        user2.registerAccount();
        user2.requestBook();

        System.out.println();
        user3.registerAccount();
        user3.requestBook();

        System.out.println();
        user4.registerAccount();
        user4.requestBook();
    }
}