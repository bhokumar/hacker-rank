package org.bhoopendra.learning.algos.design.revision2;

/**
 * Created by bhokumar on 7/5/2017.
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
            while (j>-1 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

    }
}
