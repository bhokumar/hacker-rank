package org.bhoopendra.learning.algos.design.revision3;

/**
 * Created by BHOOPENDRA on 7/6/2017.
 */
public class InsertionSort implements org.bhoopendra.learning.algos.design.InsertionSort {
    public static void main(String[] args) {
        int arr[] = {4,89,24,1,6,3,5,2};
        new InsertionSort().insertionSort(arr);
        for(int item : arr){
            System.out.println(item);
        }
    }
    @Override
    public void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while (j>-1 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
