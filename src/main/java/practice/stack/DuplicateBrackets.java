package practice.stack;

import java.util.Stack;

/**
 * 1. You are given a string exp representing an expression.
 * 2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
 * 3. But, some of the pair of brackets maybe extra/needless.
 * 4. You are required to print true if you detect extra brackets and false otherwise.
 *
 * e.g.'
 * ((a + b) + (c + d)) -> false
 * (a + b) + ((c + d)) -> true
 */
public class DuplicateBrackets {
    public static void main(String[] args) {
        Stack<Character> stack =  new Stack<>();
        String str = "(a + b) + ((c + d))";
        int index = 0;

        while (index < str.length()){
            char ch  =  str.charAt(index);
            if(ch == ')'){
                if(stack.peek() == '('){
                    System.out.println("Duplicate brackets");
                    return;
                }else {
                    while (stack.peek() != '('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }else {
                stack.push(ch);
            }
            index++;
        }
        System.out.println("No duplicate brackets");
    }
}
