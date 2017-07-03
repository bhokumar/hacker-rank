package org.bhoopendra.learning.algos22;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {2,3,9,5,7,1,2};
		new InsertionSort().insertionSort(arr);
		for(int item : arr){
			System.out.println(item);
		}
	}
	
	private void insertionSort(int arr[]){
		for(int i=1;i<arr.length;i++){
			int key = arr[i];;
			int j= i-1;
			while (j>-1 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
	}

}
