package entities;

public class Rectangle {
    public double width;
    public double height;

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
