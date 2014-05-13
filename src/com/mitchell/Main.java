package com.mitchell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        double compNum = Math.random();
        String compGuess;
        String guess;
        System.out.println("Rock, paper, or scissors?");
        guess = s.nextLine();
        guess = guess.toLowerCase();
        if(compNum < 0.34){
            compGuess = "rock";
        }
        else if(compNum <= 0.67){
            compGuess = "paper";
        }
        else {
            compGuess = "scissors";
        }
        System.out.println("Computer: " + compGuess);

        if(guess.equals(compGuess)){
            System.out.println("The result is a tie!");
        }

        else if(guess.equals("rock")){
            if(compGuess.equals("scissors")){
                System.out.println("You win!");
            }
            else{
                System.out.println("Computer wins!");
            }
        }

        else if(guess.equals("paper")){
            if(compGuess.equals("rock")){
                System.out.println("You win!");
            }
            else{
                System.out.println("Computer wins!");
            }
        }

        else if(guess.equals("scissors")){
            if(compGuess.equals("rock")){
                System.out.println("You win!");
            }
            else{
                System.out.println("Computer wins!");
            }
        }



        String again;
        System.out.println("Would you like to play again?");
        again = s.nextLine();
        again = again.toLowerCase();
        if(again.equals("yes")){
            main(null);
        }

        else{
           System.exit(0);
        }
    }
}
