package Unit4;

import java.util.*;

class Circle {
    public static void main(String[] args) {
        double radius, perimeter, area;
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);

        // Reading radius
        System.out.print("Insert the radius: ");
        radius = leer.nextDouble();
        System.out.println("The radius is: " + radius + " units");

        // Computing perimeter and area
        perimeter = calculatePerimeter(radius);
        area = calculateArea(radius);

        // Output
        System.out.println("The permiter is: " + perimeter + " units");
        System.out.println("The area is: " + area + " units^2");
    } // End main

    public static double calculatePerimeter(double radius) {
        double value;
        value = 2.0 * Math.PI * radius;
        return value;
    } // End of method calculatePerimeter

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    } // End of method calculateArea
}