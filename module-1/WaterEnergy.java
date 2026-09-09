/*
 * Alrich Rigonios
 * CSD 402 - Java for Programmers
 * Module 1.3 Programming Assignment
 * 09/08/2026
 *
 * This program calculates the amount of energy needed
 * to heat water from an initial temperature to a final temperature.
 */

import java.util.Scanner;

public class WaterEnergy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        double energy = waterMass
                * (finalTemperature - initialTemperature)
                * 4184;

        System.out.println("The energy needed is " + energy + " joules.");

        input.close();
    }
}