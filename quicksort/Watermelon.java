import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 2){
            System.out.println("NO");
            return;
        }
        System.out.println(n % 2 == 0 ? "YES" : "NO");
    }
}
