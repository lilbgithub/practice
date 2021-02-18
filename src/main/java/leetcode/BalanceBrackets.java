package leetcode;

import java.util.Stack;

/**
 * https://www.youtube.com/watch?v=uuE2pEjLiEI
 */
public class BalanceBrackets {
    public static void main(String[] args) {
        System.out.println(findBalance("{()}+1()("));
    }

    public static boolean findBalance(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}') {
                if (closingHandler(stack, '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (ch == ')') {
                if (closingHandler(stack, '(')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (ch == ']') {
                if (closingHandler(stack, '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }



    public static boolean closingHandler(Stack<Character> stack, char openningChar) {
        if (stack.empty()) {
            return false;
        } else if (stack.peek() != openningChar) {
            return false;
        } else {
            return true;
        }
    }
}
