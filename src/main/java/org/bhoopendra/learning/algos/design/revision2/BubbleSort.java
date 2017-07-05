package org.bhoopendra.learning.algos.design.revision2;

/**
 * Created by bhokumar on 7/5/2017.
 */
public class BubbleSort implements org.bhoopendra.learning.algos.design.BubbleSort {
    public static void main(String[] args) {
        int arr[] = {4,89,24,1,6,3,5,2};
        new BubbleSort().bubbleSort(arr);
        for(int item : arr){
            System.out.println(item);
        }
    }

    @Override
    public void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
