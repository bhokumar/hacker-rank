package org.bhoopendra.learning.algos1;

public class MergerSort {

	public static void main(String[] args) {
		int arr[] = {2,4,3,1,2,9,45};
		new MergerSort().mergeSort(arr, 0, 6);
		for(int item : arr){
			System.out.println(item);
		}
	}
	
	private void mergeSort(int arr[], final int firstIndex, final int lastIndex){
		if(firstIndex<lastIndex){
			int middleIndex = firstIndex +(lastIndex-firstIndex)/2;
			mergeSort(arr, firstIndex, middleIndex);
			mergeSort(arr, middleIndex+1, lastIndex);
			merge(arr, firstIndex, middleIndex, lastIndex);
		}
	}
	
	private void merge(int arr[], final int firstIndex,final int middleIndex, final int lastIndex){
		final int helper[] = new int[arr.length];
		for(int i=firstIndex;i<=lastIndex;i++){
			helper[i] = arr[i];
		}
		
		int i= firstIndex;
		int j= middleIndex+1;
		int k = firstIndex;
		
		while (i<=middleIndex && j <= lastIndex) {
			if(helper[i]<helper[j]){
				arr[k] = helper[i];
				i++;
			}else{
				arr[k] = helper[j];
				j++;
			}
			k++;
		}
		
		while (i<=middleIndex) {
			arr[k] = helper[i];
			i++;
			k++;
		}
		
	}

}
