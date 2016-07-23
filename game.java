package com.company;

import java.util.Random;
import java.util.Scanner;

public class game {
    /*private int trial = 3;*/
    private int credits = 3;
    private int random_number;
    private int input_number;
    Scanner input = new Scanner(System.in);
    Random rn = new Random();

    public void start_game() {
        System.out.println("Please Enter you number between 1 to 10");
        int user_enter_number = input.nextInt();
        this.setRandom_number(rn.nextInt(10) + 1);
        this.setInput_number(user_enter_number);
        this.verify_number();
    }

    public void setInput_number(int input_number) {
        this.input_number = input_number;
    }

    public int getInput_number() {
        return input_number;
    }

    public void setRandom_number(int random_number) {
        this.random_number = random_number;
    }

    public int getRandom_number() {
        return random_number;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    private void verify_number() {

        if (this.getCredits() == 0) {
            System.out.println("You have not enough credits to play this game. \n Press 1 For add more Credits \n Press 2 For exit game.");
            int user_next_add = input.nextInt();
            if (user_next_add == 1) {
                System.out.println("Please enter credits between 1 to 10.");
                int user_new_credits = input.nextInt();
                if (user_new_credits <= 10) {
                    this.setCredits(user_new_credits);
                    this.start_game();
                } else {
                    System.out.println("You have entered invalid credits so this program has been terminated.");
                }
            }
            return;
        }
        int update_credits = this.getCredits() - 1;
        this.setCredits(update_credits);
        if (this.getInput_number() == this.getRandom_number()) {
            System.out.println("Congratulation you win the game.");
        } else {
            System.out.println("You loose the game pleas try again.");
        }

        System.out.println("Do you want to play again?\n Press 1 for yes\n Press 2 for no");
        int input_again = input.nextInt();
        if (input_again == 1) {
            this.start_game();
        } else {
            System.out.println("Thank you for play this game.");
        }


    }

}
