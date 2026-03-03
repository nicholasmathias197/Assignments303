public class Rectangle extends Shape implements Movable {
    protected double width;
    protected double length;
    private int x, y;  // x and y coordinates for Movable interface

    // Constructors
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
        this.x = 0;
        this.y = 0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.x = 0;
        this.y = 0;
    }

    public Rectangle(double width, double length, int x, int y) {
        this.width = width;
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public Rectangle(double width, double length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.x = 0;
        this.y = 0;
    }

    // Implementing abstract method from Shape class
    @Override
    public double getArea() {
        return width * length;
    }

    // Overriding displayshapName method
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Rectangle of width " + this.width + " and length " + this.length);
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
        return "Rectangle[width=" + width + ", length=" + length + ", color=" + color + "] Coordinates: " + getCoordinate();
    }
}