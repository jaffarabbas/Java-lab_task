/******************************************************************************

 Lab Task:

 Task 3:

 Task 2 is a sequential process for all customers with fixed debit and credit value. Enhance the application by
 using control statement to take input of account number and make user choose function to perform(debit,
 credit, withdraw).(Inputs: Acc No, Action to perform, Amount to perform action).


 *******************************************************************************/
import java.util.Random;
import java.util.Scanner;

class CustomerAccount
{
    //Variables

    private String CustomerName;
    private String TypeOfAccount;
    private long AccountNumber;
    private double CurrentBalance;

    //constructor

    public CustomerAccount(String CustomerName,String TypeOfAccount,long AccountNumber,double CurrentBalance)
    {
        this.CustomerName = CustomerName;
        this.TypeOfAccount = TypeOfAccount;
        this.AccountNumber = AccountNumber;
        this.CurrentBalance = CurrentBalance;
    }

    //Methods

    public double debit(double amount){
        if(amount > CurrentBalance){
            amount = amount > 0 ? (amount*-1) : amount;
            CurrentBalance -= amount;
            System.out.println("Complete the transaction of account no "+AccountNumber);
        }
        else {
            System.out.println("Error on the amount your CurrentBalance is less then amount you wants to withdraw " + CurrentBalance + " > " + amount);
        }
        return CurrentBalance;
    }
    public double credit(double amount){
        if(amount < 0){
            CurrentBalance += amount;
            System.out.println("Complete the transaction of account no "+AccountNumber);
        }
        else{
            System.out.println("Error on the amount "+amount+" must be greater than 0");
        }
        return CurrentBalance;
    }
    public void withdraw(double amount){
        if(amount < CurrentBalance){
            amount = amount > 0 ? (amount*-1) : amount;
            CurrentBalance -= amount;
            System.out.println("Complete the transaction of account no "+AccountNumber);
        }
        else{
            System.out.println("Error on the amount your CurrentBalance is less then amount you wants to withdraw "+CurrentBalance+" < "+amount);
        }
    }
    public void getDetail(int no){
        System.out.println("\t\t\tUser No "+no);
        System.out.println("Customer Name is "+CustomerName);
        System.out.println("Type Of Account of Mr."+CustomerName+" is "+TypeOfAccount);
        System.out.println("Account Number of Mr."+CustomerName+" is "+AccountNumber);
        System.out.println("Current Balance of Account Number is "+AccountNumber+" is "+CurrentBalance+"\n");
    }



}


public class Main
{
    public static void main (String[]args)
    {
        Random rng = new Random();
        long UserAcoountNo_1 = (Long) (rng.nextLong() % 100000000000000L) + 5200000000000000L;
        long UserAcoountNo_2 = (Long) (rng.nextLong() % 100000000000000L) + 5200000000000000L;
        long UserAcoountNo_3 = (Long) (rng.nextLong() % 100000000000000L) + 5200000000000000L;

        CustomerAccount User1 = new CustomerAccount("Muhammad Fahad","Assiats",UserAcoountNo_1,5000);
        User1.getDetail(1);

        CustomerAccount User2 = new CustomerAccount("Ahmed Amin","Capital",UserAcoountNo_2,80000);
        User2.getDetail(2);

        CustomerAccount User3 = new CustomerAccount("Jaffar Abbas","Capital",UserAcoountNo_3,500);
        User3.getDetail(3);

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Enter the Customer Account no (1,2,3): ");
            int User = scan.nextInt();
            System.out.println("Enter the Operation you wants to perform(credit = T,debit = F)");
            char method = Character.toUpperCase(scan.next().charAt(0));
            System.out.println("Enter the amount you wants to perform");
            int amount = scan.nextInt();

            switch(User){
                case 1:
                    double temp = method == 'T' ? User1.credit(amount): User1.debit(amount);
                    User1.getDetail(1);
                    break;
                case 2:
                     temp = method == 'T' ? User2.credit(amount): User2.debit(amount);
                    User2.getDetail(2);
                    break;
                case 3:
                     temp = method == 'T' ? User3.credit(amount): User3.debit(amount);
                    User3.getDetail(3);
                    break;
            }


        }while(true);

    }
}


