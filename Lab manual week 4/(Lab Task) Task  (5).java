/******************************************************************************
 Lab Task

 Task 5:

 Write a Payroll class that uses the following arrays as fields:
 ● employeeId. An array of seven integers to hold employee identification numbers. The array should be
 initialized with the following numbers: 5658845 4520125 7895122 8777541 8451277 1302850 7580489
 ● hours. An array of seven integers to hold the number of hours worked by each employee
 ● payRate. An array of seven doubles to hold each employee’s hourly pay rate
 ● wages. An array of seven doubles to hold each employee’s gross wages The class should relate the data in
 each array through the subscripts. For example, the number in element 0 of the hours array should be the
 number of hours worked by the employee whose identification number is stored in element 0 of the
 employeeId array. That same employee’s pay rate should be stored in element 0 of the payRate array. In
 addition to the appropriate accessor and mutator methods, the class should have a method that accepts an
 employee’s identification number as an argument and returns the gross pay for that employee.


 *******************************************************************************/
import java.util.Scanner;


class Payroll{
    public int length = 7;
    public int[] employeeId;
    private float[] hours = new float[length];
    private double[] pay = new double[length];
    private double[] wage = new double[length];

    public Payroll() {
        employeeId = new int[]{5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    }

    public double wages(int number, float hours, double payRate){
        this.hours[number] = hours;
        this.pay[number] = payRate;
        this.wage[number] = hours * payRate;

        return this.wage[number];
    }


}

public class Main{
    public static void main(String[] args){
        Payroll work = new Payroll();
        Scanner input = new Scanner(System.in);
        float hours;
        double payRate;

        for (int i=0; i<work.length; ++i) {
            System.out.println("For Employee # "+work.employeeId[i]+" ");
            System.out.println("How many hours has worked?");
            hours = input.nextFloat();

            System.out.println("Enter the pay rate per hours of Employee");
            payRate = input.nextDouble();

            System.out.println("The wages of the Employee = "+work.wages(i,hours,payRate));




        }




    }

}


