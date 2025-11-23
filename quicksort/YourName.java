import java.util.HashMap;
import java.util.Scanner;

public class YourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            int n2 = sc.nextInt();
            sc.nextLine(); 
            String name = sc.nextLine();
            String s1 = name.split(" ")[0];
            String s2 = name.split(" ")[1];
            HashMap<Character, Integer> map = new HashMap<>();
            HashMap<Character, Integer> map1 = new HashMap<>();
            for(int j = 0; j < n2; j++) {
                char ch = s1.charAt(j);
                if(map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
            for(int j = 0; j < n2; j++) {
                char ch = s2.charAt(j);
                if(map1.containsKey(ch)) {
                    map1.put(ch, map1.get(ch) + 1);
                } else {
                   map1.put(ch, 1);
                }
            }
            for(char key : map.keySet()) {
                if(map.get(key).equals(map1.get(key))) {
                    map1.remove(key);
                }
            }
            if(map1.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
