package org.bhoopendra.learning.algos;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {10,2,3,6,8,9};
		new InsertionSort().insertionSort(arr, 6);
		for(int item:arr){
			System.out.println(item);
		}
	}

	void insertionSort(int arr[] , int n){
		for(int i=1;i<n;i++){
			int t = arr[i];
			int j=i-1;
			while(j>-1 && arr[j]>arr[j+1]){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=t;
		}
	}

}
