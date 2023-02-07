package org.example;

import static org.example.BalancedParentheses.balancedBrackets;
import static org.example.BalancedParentheses.balancedParentheses;
import static org.example.MissingNumber.*;

public class Main {
    public static void main(String[] args) {
        int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] missingSeven = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

        System.out.println("Missing Max:" + missingNumber(missingMax, 10));
        System.out.println("Missing None:" + missingNumber(missingNone, 10));
        System.out.println("Missing Seven:" + missingNumber(missingSeven, 10));
        System.out.println("Missing Max:" + missingNumberSort(missingMax, 10));
        System.out.println("Missing None:" + missingNumberSort(missingNone, 10));
        System.out.println("Missing Seven:" + missingNumberSort(missingSeven, 10));
        System.out.println("Missing Max:" + missingNumberSum(missingMax, 10));
        System.out.println("Missing None:" + missingNumberSum(missingNone, 10));
        System.out.println("Missing Seven:" + missingNumberSum(missingSeven, 10));


        String balancedParens = "(1)";
        String tooManyOpenParens = "((1";
        String tooManyOpenParens1 = "(1)(";
        String tooManyClosedParens = "(1))";
        String startClosedParens = ")(";
        String emptyString = "";

        System.out.println("Balanced Parentheses Testing: TTFFFF");
        System.out.println(balancedParentheses(balancedParens));
        System.out.println(balancedParentheses(emptyString));
        System.out.println(balancedParentheses(tooManyOpenParens));
        System.out.println(balancedParentheses(tooManyOpenParens1));
        System.out.println(balancedParentheses(tooManyClosedParens));
        System.out.println(balancedParentheses(startClosedParens));

        String balancedAngleBrackets = "<<>>";
        String balancedComboBrackets = "<({})>";
        String mismatchedBrackets = "<({)}>";

        System.out.println("Balanced Brackets Testing: TTFFFFTTF");
        System.out.println(balancedBrackets(emptyString));
        System.out.println(balancedBrackets(balancedParens));
        System.out.println(balancedBrackets(tooManyOpenParens));
        System.out.println(balancedBrackets(tooManyOpenParens1));
        System.out.println(balancedBrackets(tooManyClosedParens));
        System.out.println(balancedBrackets(startClosedParens));
        System.out.println(balancedBrackets(balancedAngleBrackets));
        System.out.println(balancedBrackets(balancedComboBrackets));
        System.out.println(balancedBrackets(mismatchedBrackets));


    }
}