/******************************************************************************
Home Tasks

Task 2

Pakistan Stock Exchange provides a reliable, orderly, liquid and efficient digitized market place where
investors can buy and sell listed companies’ common stocks and other securities. They have asked you to
design a class for their Stocks. Create a class Stock
· A string data field named symbol for the stock’s symbol.
· A string data field named name for the stock’s name.
· A double data field named previousClosingPrice that stores the stock price for the previous day.
· A double data field named currentPrice that stores the stock price for the current time.
· A constructor that creates a stock with the specified symbol and name.
· A method named getChangePercent() that returns the percentage changed from
previousClosingPrice to currentPrice.
Draw the UML diagram for the class and then implement the class. Write a test program that creates a
Stock object with the stock symbol ORCL, the name Oracle Corporation, and the previous closing price
of 34.5. Set a new current price to 34.35 and display the price-change percentage.
*******************************************************************************/

class Stock{
  private String symbol;
  public String name;
  private double previousClosingPrice;
  private double currentPrice;
  
  public Stock(String givenSymbol,String givenName){
    symbol = givenSymbol;
    name = givenName;
  }
  
  public double getChangePercent(){
    double percent = (currentPrice/previousClosingPrice)*100; 
    return percent;
  }
  
  public void setpreviousClosingPrice(double previousClosingPrice){
    this.previousClosingPrice = previousClosingPrice;
  }
  
  public void setcurrentPrice(double price){
    currentPrice = price;
  }
  
  
}


public class Main
{
	public static void main(String[] args) {
  
    Stock OC = new Stock("ORCL","Oracle Corporation");
    OC.setcurrentPrice(34.45);
    OC.setpreviousClosingPrice(34.5);
    double percent = OC.getChangePercent();    
    System.out.println(OC.name+" percentage changed from previous Closing Price to current Price "+percent);
	}
}

