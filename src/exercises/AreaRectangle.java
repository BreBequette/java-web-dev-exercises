package exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double length;
        double width;

        System.out.println("What is the length of the rectangle?");
        length = input.nextDouble();
        System.out.println("What is the width of the rectangle?");
        width = input.nextDouble();
        double area = length*width;
        System.out.println("The area of this rectangle is " + area);
        input.close();

    }
}
