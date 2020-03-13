/******************************************************************************
Task 3

Driver’s License Exam

The local Driver’s License Office has asked you to write a program that grades the written portion of the driver’s
license exam. The exam has 20 multiple choice questions.
Here are the correct answers:

1. B  6. A 11. B 16. C
2. D  7. B 12. C 17. C
3. A  8. A 13. D 18. B
4. A  9. C 14. A 19. D
5. C 10. D 15. D 20. A

A student must correctly answer 15 of the 20 questions to pass the exam. Write a class named DriverExam that holds
the correct answers to the exam in an array field. The class should also have an array field that holds the student’s
answers. The class should have the following methods:
● passed. Returns true if the student passed the exam, or false if the student failed
● totalCorrect. Returns the total number of correctly answered questions
● totalIncorrect. Returns the total number of incorrectly answered questions
● questionsMissed. An int array containing the question numbers of the questions that the student missed
Demonstrate the class in a complete program that asks the user to enter a student’s answers, and then displays the
results returned from the DriverExam class’s methods.
Input Validation: Only accept the letters A, B, C, or D as answers
*******************************************************************************/
//for import external libaray
import java.util.Scanner;


class Driver_License{
  public boolean passed;
  public int totalCorrect;
  public int totalIncorrect;
  public int questionsMissed;
  private char[] key = { 'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D','B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A' };
  private char[] answers = new char[20];
  
  Scanner scan = new Scanner(System.in); 
  char ans;
 
  public void setAnswer(){
    for(int i=0;i<20;i++){
      System.out.println("Enter the answer here for Question # "+(i+1));
      ans = Character.toUpperCase(scan.next().charAt(0));
      
      while(!(ans<='D' && ans >= 'A' || ans == '0')){ 

        System.out.println("Again Enter the answer here for Question # "+(i+1));
        ans = Character.toUpperCase(scan.next().charAt(0));
        
      }
      answers[i] = ans;
      
    }
    
  }

  public void Check_answer(){
    for(int i=0;i<20;i++){
      int temp = key[i] == answers[i] ? totalCorrect++: totalIncorrect++;
      temp = answers[i] == '0' ? questionsMissed++ : 0;
      
    }
    if(totalCorrect >= 15){
      passed = true;
      System.out.println("You are passed");
    }
    else{
      passed = !true;
      System.out.println("You are Failed by point "+(15-totalCorrect)+" and you missed question "+questionsMissed);
  
    } 
    
  }
  
  
}


public class Main
{
	public static void main(String[] args) {
	
	  System.out.println("============================================\n");
    System.out.println("\t     :: Information ::\n");
    System.out.println("This program simulates a portion of the dri-\n");
    System.out.println("ving license exam.\n");
    System.out.println("It gets the answers of the  student, and sh-\n");
    System.out.println("ows whether (s)he passed or not.\n");
    System.out.println("--------------------------------------------\n");
    System.out.println("Answers are only A, B, C, or D, and left it by press 0\n");
    System.out.println("============================================\n");

	  Driver_License Cand1 = new Driver_License();
	  
	  Cand1.setAnswer();
	  Cand1.Check_answer();
	}
}

