package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double miles;
        double gasConsumed;

        System.out.println("How many miles have you driven?");
        miles = input.nextDouble();
        System.out.println("How many gallons of gas have you consumed?");
        gasConsumed = input.nextDouble();
        double mpg = miles/gasConsumed;
        System.out.println("Your current miles per gallon is " + mpg);
        input.close();

    }
}
