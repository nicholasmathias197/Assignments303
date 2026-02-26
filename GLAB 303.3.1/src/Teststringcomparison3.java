public class Teststringcomparison3 {
    static void main(String[] args) {
        String s1 = "PerScholas";
        String s2 = "PerScholas";
        String s3 = "PerSchola";
        String s4 = "PerScholasX";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));

    }
}

