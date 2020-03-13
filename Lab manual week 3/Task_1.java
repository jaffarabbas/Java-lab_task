/******************************************************************************
 Task 1

 Generate vehicle plate numbers
 Assume a vehicle plate number consists of three uppercase letters followed by three digits. Write
 a program to randomly generate a plate number.
 *******************************************************************************/
public class Main
{
public static void main(String[] args) {

    StringBuilder s = new StringBuilder();
    for (int i = 0; i < 3; i++){
        char ch = (char) (Math.random() * 26 + 'A');
        s.append(ch);
    }
    for (int i = 0; i < 4; i++) {
        char digit1 = (char) (Math.random() * 10 + '0');
        s.append(digit1);
    }
    System.out.println("Random vehicle plate number: " + s);
}
}
