/******************************************************************************
Task 4

Write a program that plays a simple dice game between the computer and the user. When
the program runs, a loop should repeat 10 times. Each iteration of the loop should do the
following:
b "Generate a random integer in the range of 1 through 6. This is the value of the
computerb s die.
b "Generate another random integer in the range of 1 through 6. This is the value of the
userb s die.
b "The dice with the highest value wins. (In case of a tie, there is no winner for that
particular roll of the dice.)
As the loop iterates, the program should keep count of the number of times the computer
wins, and the number of times that the user wins. After the loop performs all of its iterations, the
program should display who was the grand winner, the computer or the user.
*******************************************************************************/
   
  
import java.util.Random;

 
public class Main 
{
  
public static void main (String[]args)
  {
    
 
Random rand = new Random ();
    
 
System.out.println ("The Game Start Between Computer VS User");
    
int User = 0, Computer = 0;
    
 
 
for (int i = 0; i < 10; i++)
      {
	
int dice_comp = rand.nextInt (7);
	
int dice_User = rand.nextInt (7);
	
 
System.out.println ("The Turn Number is " + (i + 1) +
			       " and the value is User = " + dice_User +
			       ", Computer = " + dice_comp);
	
 
if (dice_comp > dice_User)
	  {
	    
Computer++;
	    
System.out.println ("Computer is the Winner");
	  
}
	
	else if (dice_comp < dice_User)
	  {
	    
User++;
	    
System.out.println ("User is the Winner");
	  
}
      
 
 
}
    
 
if (User > Computer)
      {
	
System.out.println ("User win " + User + " and is the Grand Winner");
      
}
    
    else if (User < Computer)
      {
	
System.out.println ("Computer win " + Computer +
			     " and is the Grand Winner");
      
}
    
    else
      {
	
System.out.println ("The Game end on Ties");
      
}
  
 
}

}


