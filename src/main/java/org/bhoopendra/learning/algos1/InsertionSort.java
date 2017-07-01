package org.bhoopendra.learning.algos1;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {2,4,3,1,2,9,45};
		insertionSort(arr);
		for(int item : arr){
			System.out.println(item);
		}
	}
	
	private static void insertionSort(int arr[]){
		for(int i=1;i<arr.length;i++){
			int key=arr[i];
			int j = i-1;
			while (j>-1 && arr[j]>key) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]= key;
		}
	}

}
