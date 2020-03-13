/******************************************************************************
Task 5

(Reverse the numbers entered)

Write a program that reads ten integers and displays them in the reverse of the order in which
they were read.
*******************************************************************************/
 
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the length of the array you wants to Reverse : ");
        int n = scan.nextInt();
        
        int[] array = new int[n];
        int i;
        
        for (i=0; i<n; i++){
            System.out.print("Enter the value of index "+i +" = ");
            array[i] = scan.nextInt();
        }
        
        for(i=n-1; i>=0; i--){
            System.out.print(" " + array[i]);
        }
        
       
    }
}
