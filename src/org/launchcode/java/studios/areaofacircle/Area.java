package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //double pi = 3.14;
        double radius;

        System.out.println("Enter a radius: ");
        try {
            boolean keepLooping = true;
            while(keepLooping) {
                radius = input.nextDouble();

                if (radius < 0) {
                    System.out.println("You cannot enter a negative number.");
                } else {
                    double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
                    keepLooping = false;
                }
            }
        } catch(Exception error) {
            System.out.println("You must provide a numeric input.");
        }

        input.close();
    }
}
