package org.bhoopendra.learning.algos.sort;

public class InsertionMain {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for(int unsortedIndex = 1; unsortedIndex < intArray.length; unsortedIndex++) {
            int newElement = intArray[unsortedIndex];

            int i;
            for(i=unsortedIndex; i>0 && intArray[i-1]>newElement;i--) {
                intArray[i] = intArray[i-1];
            }

            intArray[i] = newElement;
        }
    }
}
