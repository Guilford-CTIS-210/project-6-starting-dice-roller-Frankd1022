package edu.guilford;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // default for loop, prints loop variable as it counts up
        // for (int i = 0; i < 10; i++) {
        // System.out.println("loop variable i = " + i);

        Random rand = new Random();

        // Create a Scanner 
        Scanner scan = new Scanner(System.in);

        // Intro
        System.out.println("This program rolls a number of dice and totals the rolls.");
        // Ask the user how many sides the dice should have
        System.out.print("How many sides should the dice have? ");
        int sides = scan.nextInt();
        // Ask the user how many dice they want to roll
        System.out.print("How many dice do you want to roll? ");
        int number = scan.nextInt();
        // Variable to keep track of the sum of dice rolls
        int sum = 0;
        // Loop to roll dice and calculate the sum
        for (int i = 1; i <= number; i++) {
            // Generate a random number between 1 and the number of sides
            int diceRoll = rand.nextInt(sides) + 1;
            // Add the dice roll to the sum
            sum += diceRoll;
        }

        // Print the final sum of all dice rolls
        System.out.println("Rolling " + number + "d" + sides + " = " + sum);

        // Close the Scanner 
        scan.close();
    }
}
