				    /* Practice Tasks

 What is the output of the following code?
		
				     */

public class Main
{
  public static void main (String[]args)
  {
    int[] values = new int[5];
    for (int count = 0; count < 5; count++)
        values[count] = count + 1;
    for (int count = 0; count < 5; count++)
        System.out.println (values[count]);
        
        /* The output of code is 
    
    1
    2  
    3
    4
    5
    */
  }
}
