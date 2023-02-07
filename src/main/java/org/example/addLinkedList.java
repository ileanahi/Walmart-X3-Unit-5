package org.example;

import java.util.Iterator;
import java.util.LinkedList;

public class addLinkedList {
    // runtime complexity: O(n)

    public static LinkedList addLinkedList (LinkedList first, LinkedList second) {
        // convert linked lists into integer values
        // reverse numbers
        // add numbers together
        // reverse numbers
        // convert back to linked list

        Iterator<Integer> firstIterator = first.descendingIterator();
        Iterator<Integer> secondIterator = second.descendingIterator();

        int firstNum = 0;
        int decimalPlace = 1;
        while(firstIterator.hasNext()) {
            firstNum += decimalPlace * firstIterator.next();
            decimalPlace *= 10;
        }

        int secondNum = 0;
        decimalPlace = 1;
        while(secondIterator.hasNext()) {
            secondNum += decimalPlace * secondIterator.next();
            decimalPlace *= 10;
        }

        int sum = firstNum + secondNum;

        String sumString = String.valueOf(sum);

        LinkedList<Integer> sumList = new LinkedList<Integer>();
        for (int i = 0; i < sumString.length();  i++) {
            sumList.add(Character.getNumericValue(sumString.charAt(i)));
        }

        return sumList;
    }
}
