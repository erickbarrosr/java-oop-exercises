package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.print("Enter rectangle width: ");
        rectangle.width = sc.nextDouble();

        System.out.print("Enter rectangle height: ");
        rectangle.height = sc.nextDouble();

        double rectangleArea = rectangle.calculateArea();
        System.out.printf("AREA = %.2f%n", rectangleArea);

        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.printf("PERIMETER = %.2f%n", rectanglePerimeter);

        double rectangleDiagonal = rectangle.calculateDiagonal();
        System.out.printf("DIAGONAL = %.2f%n", rectangleDiagonal);

        sc.close();
    }
}