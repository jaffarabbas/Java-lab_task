/******************************************************************************

 Lab Task:

 Task 2:

 Create a CustomerAccount class with attributes CustomerName, TypeOfAccount,
 AccountNumber, CurrentBalance and methods such as debit(), credit(), withdraw() etc.
 Apply access modifiers to enhance security so that customer cannot directly change account balance.
 Use getter and setter methods to view and modify balance according to debit and credit amount. Create
 multiple objects for customer accounts (atleast three) and store customer information. Call methods from
 different objects with different information.
 (Apply validations where required).

 *******************************************************************************/
import java.util.Random;

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
    public void credit(double amount){
        if(amount > 0){
            CurrentBalance += amount;
            System.out.println("Complete the transaction of account no "+AccountNumber);
        }
        else{
            System.out.println("Error on the amount "+amount+" must be greater than 0");
        }
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
        
        CustomerAccount User2 = new CustomerAccount("Ahmed Amin","Capital",UserAcoountNo_2,800);
        User2.getDetail(2);
        
        CustomerAccount User3 = new CustomerAccount("Jaffar Abbas","Capital",UserAcoountNo_3,500);
        User3.getDetail(3);
        
        int amount = 7000;
        
        User1.credit(amount);
        User1.getDetail(1);
        
        User2.withdraw(amount);
        User2.getDetail(2);
        
        User3.debit(amount);
        User3.getDetail(3);
        
            
          
    }
}


