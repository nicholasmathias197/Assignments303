public class ConstantExample {
    public static void main(String[] args) {
        final double PI = 3.14159;


        double radius = 5.0;
        double area = PI * radius * radius;


        System.out.println("Circle Calculations:");
        System.out.println("Radius: " + radius);
        System.out.println("PI constant: " + PI);
        System.out.println("Area (πr²): " + area);
    }
}