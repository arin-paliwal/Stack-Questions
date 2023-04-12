import java.util.*;

public class BalancingParenthesis {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;
                boolean check = BalancingParenthesis.isTrue(stack.peek(), s.charAt(i));

                if (check) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty())
            return false;
        return true;

    }

    public static boolean isTrue(char OB, char CB) {
        if (OB == '{' && CB == '}')
            return true;
        if (OB == '(' && CB == ')')
            return true;
        if (OB == '[' && CB == ']')
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.print("check");
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if (BalancingParenthesis.isValid(S))
            System.out.println("true");
        else
            System.out.println("false");
        sc.close();

    }
}