public class Teststringcomparison2 {
    static void main(String[] args) {
        String s1 = "PerScholas";
        String s2 = "PerScholas";
        String s3 = new String("PerScholas");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}