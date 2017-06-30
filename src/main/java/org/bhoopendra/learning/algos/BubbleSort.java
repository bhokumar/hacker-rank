package org.bhoopendra.learning.algos;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {10,2,3,6,8,9};
		new BubbleSort().bubbleSort(arr, 6);
		for(int item:arr){
			System.out.println(item);
		}
	}

	void bubbleSort(int arr[], int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
