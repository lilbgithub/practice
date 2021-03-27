package practice.ds.stack;

import java.util.Stack;

/**
 * 1. You are given a string exp representing an expression.
 * 2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.
 * <p>
 * e.g.
 * [(a + b) + {(c + d) * (e / f)}] -> true
 * [(a + b) + {(c + d) * (e / f)]} -> false
 * [(a + b) + {(c + d) * (e / f)} -> false
 * ([(a + b) + {(c + d) * (e / f)}] -> false
 */
public class BalanceBrackets {
    public static void main(String[] args) {
        boolean result = checkBalance("[(a + b) + {(c + d) * (e / f)}]");
        System.out.println("Result is :" + result);
    }

    public static boolean checkBalance(String str) {
        Stack<Character> stack = new Stack<>();

        int index = 0;
        while (index < str.length()){
            char ch  =  str.charAt(index);
            if('(' == ch ||'{' == ch ||'[' == ch ){
                stack.push(ch);
            }else if(')' == ch) {
                popHandler(stack,'(' );
            }else if('}' == ch) {
                popHandler(stack,'{' );
            }else if(']' == ch) {
                popHandler(stack,'[' );
            }
            index++;

        }
        if(stack.size() == 0){
            return true;
        }
        return false;
    }

    public static void popHandler(Stack<Character> stack, Character expectedOpeningChar){
        if(stack.peek() == expectedOpeningChar){
            stack.pop();
        }
    }
}
