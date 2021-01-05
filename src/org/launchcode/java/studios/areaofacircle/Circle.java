package org.launchcode.java.studios.areaofacircle;

public class Circle {
    public static Double getArea(Double radius){
        double area = 0.0;
        if (radius >= 0){
            area = 3.14 * radius * radius;
        } else if (radius < 0) {
            System.out.println("Ope! Radius must be positive.");
            System.exit(0);
        } else if (radius.isNaN()) {
            System.out.println("Ope! Radius must be a number.");
            System.exit(0);
        } else {
            System.exit(0);
        }
        return area;
    }
}
