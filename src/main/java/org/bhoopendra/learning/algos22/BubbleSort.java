package org.bhoopendra.learning.algos22;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {2,3,9,5,7,1,2};
		new BubbleSort().bubbleSort(arr);
		for(int item : arr){
			System.out.println(item);
		}
	}

	private void bubbleSort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
	}
}
