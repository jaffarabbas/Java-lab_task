/******************************************************************************
                            Evaluation Tasks:

Task 3a

Random Number Guessing Game

Write a program that generates a random number and asks the user to guess what the number is.
If the user’s guess is higher than the random number, the program should display “Too high, try
again.” If the user’s guess is lower than the random number, the program should display “Too
low, try again.” The program should use a loop that repeats until the user correctly guesses the
random number.

Task 3b

Random Number Guessing Game Enhancement

Enhance the program that you wrote for Task 3a so it keeps a count of the number of guesses
that the user makes. When the user correctly guesses the random number, the program should
display the number of guesses.
*******************************************************************************/

import java.util.Random; 
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Random rand = new Random(); 
        Scanner scan = new Scanner(System.in);
  
        
        // Generate random integers in range 0 to 999999 
        int Num = (rand.nextInt(10)); 
        int guesses = 0;
        int count = 1;
       
        System.out.println("Guessing Game Start");
        
        do{
            
            System.out.print("Your turn number = "+count+" \nEnter the number: ");
            guesses = scan.nextInt();
            
            if(guesses == Num)
                System.out.println("You Win the game in "+ (count+1) +" turn");
            
            else if(guesses < Num)
                System.out.println("Too lower, try again.");
            
            else
                System.out.println("Too high, try again.");
            
            
            count++;
        }while(guesses != Num);    
    
    }
}
