/******************************************************************************

Task 6

Beautifying the sentences

Write an application that takes a sentence from user and checks if the sentence stars from a
capital letter and ends with a full stop. If it doesn’t, the program should add it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your Sentence :  ");
        String sentence = scan.nextLine();
        
        int length = sentence.length();
        
        char first_letter = sentence.charAt(0);
        boolean Start_with = Character.isUpperCase(first_letter); 
        boolean End_with = sentence.charAt(length-1)=='.';
          
            if(Start_with && End_with){
                System.out.println("Code is Beutifyyyy");
            }
            
            else{
                first_letter = Character.toUpperCase(first_letter);
                sentence = sentence.substring(1);
                
                if(!End_with){
                    sentence += ".";
                }
            }
            
        System.out.println(first_letter+sentence);

    }
}