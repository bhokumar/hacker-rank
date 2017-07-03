package org.bhoopendra.learning.algos.design.revision1;

public class MergeSort implements org.bhoopendra.learning.algos.design.MergeSort{

	public static void main(String[] args) {
		int arr[] = {2,3,9,5,7,1,2};
		new MergeSort().mergeSort(arr, 0, 6);
		for(int item : arr){
			System.out.println(item);
		}
	}

	@Override
	public void mergeSort(int[] arr, final int firstIndex, int lastIndex) {
		if(firstIndex<lastIndex){
			final int middleIndex = firstIndex + (lastIndex-firstIndex)/2;
			mergeSort(arr, firstIndex, middleIndex);
			mergeSort(arr, middleIndex+1, lastIndex);
			merge(arr, firstIndex, middleIndex, lastIndex);
		}
	}

	@Override
	public void merge(int[] arr, int firstIndex, int middleIndex, int lastIndex) {
		final int[] helper = new int[arr.length];
		for(int i=firstIndex;i<=lastIndex;i++){
			helper[i] = arr[i];
		}
		
		int i= firstIndex;
		int j= middleIndex+1;
		int k = firstIndex;
		while (i<=middleIndex && j<=lastIndex) {
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
			arr[k]= helper[i];
			i++;
			k++;
		}
		
	}

}
