/******************************************************************************

Lab Task:

Task 1:

Choose an object (Car, mobile). Identify its attributes/fields and behavior/methods. Create a class of that
object with instance variables and instance methods. Create multiple (at least three) objects from that class,
store different values in the fields and call methods for each object.

*******************************************************************************/

class mobile
{
//Variables
  public String modal;
  public String colour;
  public int prize;
  public float camera;
  public String memory;

  //constructor

  public mobile ()
  {
    this.modal = "Company of mobile";
    this.colour = "Colour of mobile";
    this.prize = 0;
    this.camera = 0;
    this.memory = "0 GB 0 GB";
  }

  public mobile (String modal_User, String colour_User, int prize_User,
		 float camera_User, String memory_User)
  {
    this.modal = modal_User;
    this.colour = colour_User;
    this.prize = prize_User;
    this.camera = camera_User;
    this.memory = memory_User;
    this.getValues ();
  }


//methods
  public void setAllValue (String modal, String colour, int prize,
			   float camera, String memory)
  {
    this.modal = modal;
    this.colour = colour;
    this.prize = prize;
    this.camera = camera;
    this.memory = memory;
    this.getValues ();
  }

  public void getValues ()
  {
    System.out.println ("The modal of the mobile is " + modal);
    System.out.println ("The colour of " + modal + " is " + colour);
    System.out.println ("The prize of " + modal + " in colour " + colour +
			" is $" + prize + " Dollar");
    System.out.println ("The camera of " + modal + " is " + camera +
			" megapixel");
    System.out.println ("The memory of " + modal + " is " + memory);
  }


}


public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("\nObject no 1 is Creating\n");
    // object no 1 and all the Values are constructor.
    mobile mobile_1 =
      new mobile ("Infinix S5 lite", "Sky Blue", 40, 16.5f, "4GB 64GB");


      System.out.println ("\nObject no 2 is Creating\n");
    //object no 2 and all the vale are assigned by setAllValue method.
    mobile mobile_2 = new mobile ();
      mobile_2.setAllValue ("Realme S5 pro", "black", 60, 20.0f, "4GB 128GB");

      System.out.println ("\nObject no 3 is Creating\n");
    //object no 3 and all the vale are assigned by "." operator;
    mobile mobile_3 = new mobile ();
      mobile_3.modal = "OPPO F17 pro";
      mobile_3.colour = "Red";
      mobile_3.prize = 120;
      mobile_3.camera = 25.8f;
      mobile_3.memory = "6GB 256GB";

      mobile_3.getValues ();


  }
}
