public class Rectangle extends Shape2D {

    private double width;
    private double height;

    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (height * 2) + (width * 2);
    }
}
