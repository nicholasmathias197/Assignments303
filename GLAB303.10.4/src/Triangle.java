public class Triangle extends Shape implements Movable {
    private double side1;
    private double side2;
    private double side3;
    private int x, y;  // x and y coordinates for Movable interface

    // Constructors
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
        this.x = 0;
        this.y = 0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.x = 0;
        this.y = 0;
    }

    public Triangle(double side1, double side2, double side3, int x, int y) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.x = x;
        this.y = y;
    }

    public Triangle(double side1, double side2, double side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.x = 0;
        this.y = 0;
    }

    // Implementing abstract method from Shape class
    @Override
    public double getArea() {
        // Using Heron's formula to calculate area of triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Overriding displayshapName method
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Triangle with sides: " + this.side1 + ", " + this.side2 + ", " + this.side3);
    }

    // Implementing methods from Movable interface
    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String getCoordinate() {
        return "(" + x + "," + y + ")";
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Triangle[sides=" + side1 + ", " + side2 + ", " + side3 + ", color=" + color + "] Coordinates: " + getCoordinate();
    }
}