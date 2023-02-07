package org.example;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParentheses {

    // runtime complexity: O(n)
    // My first iteration had problems where it didn't account for a closing parenthesis, so I had to look at the
    // solution to correct it
    public static boolean balancedParentheses(String s) {
        int unclosedParentheses = 0;
        if (s.startsWith(")")) {return false;}

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                unclosedParentheses++;
            } else if (s.charAt(i) == ')') {
                unclosedParentheses--;
            }
        }
        if (unclosedParentheses > 0) {
            return false;
        } else {
            return unclosedParentheses == 0;
        }
    }

    // runtime complexity: O(n)
    // I found this challenge very difficult to figure out as I was not very comfortable with the different data structures
    // Looking at the solution code helped me a lot to understand how to implement Stacks
    public static boolean balancedBrackets(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();

        bracketPairs.put(')', '(');
        bracketPairs.put('}', '{');
        bracketPairs.put(']', '[');
        bracketPairs.put('>', '<');

        for (int i = 0; i < s.length(); i++) {
            if (bracketPairs.containsValue(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
            else if (bracketPairs.containsKey(s.charAt(i))) {
                if (stack.isEmpty()) {
                    return false;
                }
                Character mostRecentBracket = stack.pop();
                if (!mostRecentBracket.equals(bracketPairs.get(s.charAt(i)))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
