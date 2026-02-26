public class findString {
    static void main(String[] args){
        String str1 = "Java is fun";
        int results;

        results = str1.indexOf('s');
        System.out.println(results);

        results = str1.indexOf('J');

        System.out.println(results);

        results = str1.lastIndexOf('a');

        System.out.println(results);

        results = str1.lastIndexOf('j');

        System.out.println(results);

        results= str1.lastIndexOf("ava");

        System.out.println(results);

        results = str1.lastIndexOf("java");

        System.out.println(results);
    }
}
