import java.util.*;

public class postfixexp {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

           
            if (ch == ' ') {
                continue;
            }

            if (Character.isDigit(ch)) {
                
                stack.push(Character.getNumericValue(ch));
            } else {
                
                int b = stack.pop();
                int a = stack.pop();

               
                if (ch == '+') stack.push(a + b);
                else if (ch == '-') stack.push(a - b);
                else if (ch == '*') stack.push(a * b);
                else if (ch == '/') stack.push(a / b);
                else {
                    System.out.println("Invalid operator: " + ch);
                    return;
                }
            }
        }

        
        System.out.println(stack.pop());
    }
}
