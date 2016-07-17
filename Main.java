package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Wolcome to the number game.");
        System.out.println("Please enter 1 to Play Game");
        System.out.println("Enter 2 to Exit.");
        Scanner input = new Scanner(System.in);
        int input_user = input.nextInt();
        if (input_user == 1) {
            game my_game = new game();
            System.out.println("Input Number"+my_game.getInput_number());
            System.out.println("Random Number"+my_game.getRandom_number());
        } else if (input_user == 2) {
            System.out.println("Thank you for play game");
        } else {
            System.out.println("You have enter invalid number program has been terminated.");
        }
    }
}
