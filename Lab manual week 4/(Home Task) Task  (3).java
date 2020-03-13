import java.util.Scanner;

/******************************************************************************
 Home Tasks

 Task 3

 While exercising, you can use a heart-rate monitor to see that your heart rate stays within a safe range suggested by
 your trainers and doctors. According to the American Heart Association (AHA), the formula for calculating your
 maximum heart rate in beats per minute is 220 minus your age in years.
 Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are
 estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness
 and gender of the individual. Always consult a physician or qualified health-care professional before
 beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes
 should include the person’s first name, last name and date of birth (consisting of separate attributes for
 the month, day and year of birth). Your class should have a constructor that receives this data as parameters.
 For each attribute provide set and get methods. The class also should include a method that calculates and returns the
 person’s age (in years), a method that calculates and returns the person’s maximum heart rate and a method that
 calculates and returns the person’s target heart rate. Write a Java app that prompts for the person’s information,
 instantiates an object of class HeartRates and prints the information from that object—including the person’s first
 name, last name and date of birth—then calculates and prints the person’s age in (years), maximum heart rate and
 target-heart-rate range

 *******************************************************************************/

class HeartRates{
    public String FirstName;
    public String LastName;
    public String DateOfBirth;
    public double year;


    public HeartRates(String FirstName,String LastName,String DateOfBirth,double year){
        this.setDateOfBirth(DateOfBirth);
        this.setFirstName(FirstName);
        this.setLastName(LastName);
        this.year = year;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public double MaxHeartRate(){
        double range = age() -220;
        return range;
    }

    public double age(){
        double age = 2020 - this.year;

        return age;
    }

    public double TargetHeartRate() {

        int range = (50 / 100) - (80 / 100);
        double target = range * MaxHeartRate();
        return target;
    }
}


public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first,last,DOB;

        System.out.println("Welcome to Our heart-rate monitor systems\nEnter your First Name here.......");
        first = scan.nextLine();

        System.out.println("Enter your last name here.......");
        last = scan.nextLine();

        System.out.println("Enter date of brith in this format \n-(Date) \b-");
        int date = scan.nextInt();
        System.out.print("-(Month) \b- ");
        int month = scan.nextInt();
        System.out.print("-(Year) \b- ");
        double year = scan.nextInt();

        DOB = date +"/"+month+"/"+year;
        HeartRates check1 = new HeartRates(first,last,DOB,year);

        System.out.println("Target-Heart-Rate Calculator)");
        System.out.println();
        System.out.printf("%s %s",check1.getFirstName(),check1.getLastName());
        System.out.printf("\n%s %s","DOB",check1.getDateOfBirth());
        System.out.println();
        System.out.println("Age "+check1.age());
        System.out.println();
        System.out.println("MaxHeartRate : "+check1.MaxHeartRate());
        System.out.println();
        System.out.println("TargetHeartRate: "+check1.TargetHeartRate());
    }

}
