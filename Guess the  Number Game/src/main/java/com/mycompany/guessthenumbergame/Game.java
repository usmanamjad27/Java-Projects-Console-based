/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessthenumbergame;

/**
 *
  *
 * @author Q;
     Create a class game ,which allow a user to play "Guess the Number" game once
     Game should have following  character.
     *Constructor to generate a random number
     * take user input() to take input number from user
     * condition() wether the input enter by user is correct guess number or not
     * getter and setter for no of guesses
     * use these properties to get this task done
 */
import java.util.Random;
import java.util.Scanner;

public class Game {
    public int number;
    private int no_of_guesses;

    // Constructor to generate a random number
    public Game() {
        Random rand = new Random();
        number = rand.nextInt(100) + 1; // Ensures number is between 1-100
        no_of_guesses = 5; // Default number of attempts
    }

    public void setNo_of_guesses(int no_of_guesses) {
        this.no_of_guesses = no_of_guesses;
    }

    public int getNo_of_guesses() {
        return no_of_guesses;
    }

    // Method to take user input
    public int user_input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1-100: ");
        return sc.nextInt();
    }

    // Method to check if guess is correct
    public boolean condition(int guess) {
        if (guess > number) {
            System.out.println("Your number is greater than the guess number.");
        } else if (guess < number) {
            System.out.println("Your number is smaller than the guess number.");
        } else {
            System.out.println("Congratulations! You won.");
            return true; // User guessed correctly
        }
        return false; // User didn't guess correctly
    }
}
