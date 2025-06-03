import java.util.*;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        
        String st = sc.nextLine();
        
        
        for (int i = 0; i < st.length(); i++) {
            s.push(st.charAt(i));
        }
        
        String a = "";
        
        
        while (!s.isEmpty()) {
            a = a + s.pop();
        }
        
        System.out.println(a);
    }
}
