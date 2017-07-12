package org.bhoopendra.learning.algos.design;

import java.util.Scanner;

/**
 * Created by bhokumar on 7/12/2017.
 */
public class SortingClient1 {
    public static void main(String[] args) {
        SortingClient1 sortingClient1 = new SortingClient1();
        int arr[] = {4,89,24,1,6,3,5,2};
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Merge Sort");
        System.out.println("Select any option : ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option){
            case 1:
                sortingClient1.new BubbleSort().bubbleSort(arr);
                break;
            case 2:
                sortingClient1.new InsertionSort().insertionSort(arr);
                break;
            case 3: sortingClient1.new MergeSort().mergeSort(arr,0,arr.length-1);
                break;
            default:
                System.out.println("Algorithm not implemented by this appliaction");
        }


        for(int item : arr){
            System.out.println(item);
        }
    }
    class BubbleSort implements org.bhoopendra.learning.algos.design.BubbleSort{
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
    class InsertionSort implements org.bhoopendra.learning.algos.design.InsertionSort{
        @Override
        public void insertionSort(int[] arr) {
            for (int i=1;i<arr.length;i++){
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

    class MergeSort implements org.bhoopendra.learning.algos.design.MergeSort{
        @Override
        public void mergeSort(int[] arr, int firstIndex, int lastIndex) {
            if(firstIndex<lastIndex){
                final int middleIndex = firstIndex+(lastIndex-firstIndex)/2;
                mergeSort(arr,firstIndex,middleIndex);
                mergeSort(arr,middleIndex+1,lastIndex);
                merge(arr,firstIndex,middleIndex,lastIndex);
            }
        }

        @Override
        public void merge(int[] arr, int firstIndex, int middleIndex, int lastIndex) {
            final int  helper[] = new int[arr.length];
            for(int i=firstIndex;i<=lastIndex;i++){
                helper[i] = arr[i];
            }

            int i= firstIndex;
            int j =middleIndex+1;
            int k = firstIndex;

            while (i<=middleIndex && j<=lastIndex){
                if(helper[i]<helper[j]){
                    arr[k] = helper[i];
                    i++;
                }else {
                    arr[k]= helper[j];
                    j++;
                }
                k++;
            }
            while (i<=middleIndex){
                arr[k] = helper[i];
                i++;
                k++;
            }
        }
    }
}

