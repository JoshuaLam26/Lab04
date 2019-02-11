package ca.bcit.comp2522.lab03;

public class RegularPolygon extends Polygon {

    private double length;
    private double apothem;

    public RegularPolygon(double newLength, double newApothem, int newNumberOfSides) {
        super();
        numberOfSides = newNumberOfSides;
        length = newLength;
        apothem = newApothem;
    }

    public void draw() {
        System.out.println("Drawing a regular polygon.");
    }

    public double getPerimeter() {
        return length * numberOfSides;
    }

    public double getArea() {
        return 0.5 * apothem * getPerimeter();
    }
}
