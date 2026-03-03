public class myRunner {
    public static void main(String[] args) {

        Circle c1 = new Circle(1, 2, 2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());


        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle(5, 10, 200);  // upcast
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());

// Testing Rectangle
        System.out.println("\n=== Testing Rectangle ===");
        Rectangle r1 = new Rectangle(5, 3, 2, 3);
        r1.setColor("Blue");
        System.out.println("Rectangle details: " + r1.toString());
        System.out.println("Area of Rectangle: " + r1.getArea());
        r1.displayshapName();
        System.out.println("Initial Coordinates: " + r1.getCoordinate());

        r1.moveRight();
        r1.moveUp();
        System.out.println("After move right and up, Coordinates: " + r1.getCoordinate());

        // Testing Triangle
        System.out.println("\n=== Testing Triangle ===");
        Triangle t1 = new Triangle(3, 4, 5, 5, 5);
        t1.setColor("Red");
        System.out.println("Triangle details: " + t1.toString());
        System.out.println("Area of Triangle: " + t1.getArea());
        t1.displayshapName();
        System.out.println("Initial Coordinates: " + t1.getCoordinate());

        t1.moveLeft();
        t1.moveDown();
        System.out.println("After move left and down, Coordinates: " + t1.getCoordinate());

        // Test Polymorphism with Movable interface
        System.out.println("\n=== Testing Polymorphism ===");
        Movable m1 = new Rectangle(4, 6, 7, 8);
        m1.moveUp();
        System.out.println("Rectangle after move up: " + m1.getCoordinate());

        Movable m2 = new Triangle(3, 3, 3, 9, 9);
        m2.moveLeft();
        System.out.println("Triangle after move left: " + m2.getCoordinate());
    }
}