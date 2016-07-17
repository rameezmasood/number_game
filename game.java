package com.company;

import java.util.Random;
import java.util.Scanner;

public class game {
    private int credits = 0;
    private int trial = 3;
    private int random_number;
    private int input_number;
    Scanner input = new Scanner(System.in);
    Random rn = new Random();

    public game(){
        System.out.println("Please Enter you number between 1 to 10");
        int user_enter_number = input.nextInt();
        this.setRandom_number(rn.nextInt(10)+1);
        this.setInput_number(user_enter_number);
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

    private void verify_number(){
        if(this.getInput_number() == this.getRandom_number()){
            System.out.println("Congratulation you enter correct number");
        }else{
            System.out.println("Congratulation you enter correct number");
        }
    }

}
