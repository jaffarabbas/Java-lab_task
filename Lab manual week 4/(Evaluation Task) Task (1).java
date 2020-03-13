/******************************************************************************
 Evaluation Tasks

 Task 1

 Write a class named RetailItem that holds data about an item in a retail store. The class should have the following
 fields:
 ● description. The description field references a String object that holds a brief description of the item.
 ● unitsOnHand. The unitsOnHand field is an int variable that holds the number of units currently in inventory.
 ● price. The price field is a double that holds the item’s retail price.
 Write a constructor that accepts arguments for each field, appropriate mutator methods that store values in these fields,
 and accessor methods that return the values in these fields. Once you have written the class, write a separate program
 that creates three RetailItem objects and stores the following data in them:
 Description Units on Hand Price
 Item#1 Jacket 12 5990.95
 Item #2 Designer Jeans 40 3432.95
 Item #3 Shirt 20 2494.95

 *******************************************************************************/

class RetailItem
{
    private String description;
    private int units;
    private double price;
    public RetailItem()
    {
    }
    public RetailItem(String x, int y, double z)
    {
        description=x;
        units=y;
        price=z;
    }

    public void setDesciption(String x)
    {
        description = x;
    }
    public void setPrice(double z)
    {
        price=z;
    }

    void setUnits(int y)
    {
        units=y;
    }

    public int getUnits()
    {
        return units;
    }
    public String getDescription()
    {
        return description;
    }

    public double getPrice()
    {
        return price;
    }

}
class Main
{
    public static void main(String [] args)
    {

        String str="Shirt";
        RetailItem r1=new RetailItem ("Jacket",12,59.95);
        RetailItem r2=new RetailItem ("Designer Jeans",40,34.95);
        RetailItem r3=new RetailItem();

        r3.setDesciption(str);
        r3.setUnits(20);
        r3.setPrice(24.95);

        System.out.println("__________________________________");
        System.out.println("\tDescription\tUnits on Hand\tPrice");
        System.out.println("__________________________________");

        System.out.println("Item #1\t"+r1.getDescription()+"\t\t"+r1.getUnits()+" \t\t "+r1.getPrice());
        System.out.println("Item #2\t"+r2.getDescription()+"\t\t"+r2.getUnits()+" \t\t "+r2.getPrice());
        System.out.println("Item #3\t"+r3.getDescription()+"\t\t"+r3.getUnits()+" \t\t "+r3.getPrice());

        System.exit(0);
    }
}