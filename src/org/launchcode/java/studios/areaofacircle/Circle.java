package org.launchcode.java.studios.areaofacircle;

public class Circle {
    public static Double getArea(Double radius){
        if (radius >= 0){
            return 3.14 * radius * radius;
        } else if (radius < 0) {
            System.out.println("Ope! Radius must be positive.");
            System.exit(0);
        } else if (radius.isNaN()) {
            System.out.println("Ope! Radius must be a number.");
            System.exit(0);
        } else {
            System.exit(0);
        }
        return 3.14;
    }
}
