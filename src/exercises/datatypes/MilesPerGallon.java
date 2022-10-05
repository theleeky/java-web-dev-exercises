package exercises.datatypes;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("How many gallons have you used?");
        double gallons = input.nextDouble();

        System.out.println("You've driven: " + miles/gallons + " miles-per-gallon");
    }
}
