package ca.bcit.comp2522.lab03;

public class Circle extends Shape2D {

    private double radius;

    public Circle(double newRadius) {
        radius = newRadius;
    }

    public void draw() {
        System.out.println("Drawing a circle.");
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
