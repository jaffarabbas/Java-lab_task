/******************************************************************************
 Task 2
 Rainfall
 Write a RainFall class that stores the total rainfall for each of 12 months into an array of doubles.
 The program should return the following:
 ● the total rainfall for the year
 ● the average monthly rainfall
 ● the month with the most rain
 ● the month with the least rain
 Input Validation: Do not accept negative numbers for monthly rainfall figures.
 *******************************************************************************/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        double[] rainfall = new double[12];

        Scanner obj = new Scanner(System.in);

        for (int i = 0; i < 12;){


            System.out.print("Enter the rainfall for the month of " + (i+1) +": ");

            rainfall[i] = obj.nextDouble();

            i = rainfall[i] >= 0 ? i+1 : i;
        }

        // loop for the total, average, min, max
        double  Sum = 0;
        float  average;

        double  min = rainfall[0];
        double  max = rainfall[0];

        int  min_num=0;
        int  max_num = 0;

        for (int i = 0; i < 12;i++){

            //total
            Sum += rainfall[i];

            //min or max
            if(min>rainfall[i]){
                min = rainfall[i];
                min_num = i;
            }
            else if(max<rainfall[i]){
                max = rainfall[i];
                max_num = i;
            }


        }


        System.out.println("● The total rainfall for the year = " + Sum);
        System.out.println("● the average monthly rainfall = " + Sum/12);
        System.out.println("● the month with the most rain = " + max_num + " And rain is "+max);
        System.out.println("● the month with the least rain = " + min_num + " And rain is "+min);




    }
}
