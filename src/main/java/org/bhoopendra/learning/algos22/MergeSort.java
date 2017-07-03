package org.bhoopendra.learning.algos22;

public class MergeSort implements MergeSortInterface, Merge {

	public static void main(String[] args) {
		int arr[] = {2,3,9,5,7,1,2};
		new MergeSort().mergeSort(arr, 0, arr.length-1);
		for(int item : arr){
			System.out.println(item);
		}
	}
	
	private void mergeSort(final int a[], final int firstIndex,final int lastIndex){
		if(firstIndex<lastIndex){
			int middleIndex = firstIndex + (lastIndex - firstIndex)/2;
			mergeSort(a, firstIndex, middleIndex);
			mergeSort(a, middleIndex+1, lastIndex);
			merge(a, firstIndex, middleIndex, lastIndex);
		}
	}
	
	private void merge(final int a[], final int firstIndex,final int middleIndex,final int lastIndex){
		int helper[] = new int[a.length];
		for(int i= firstIndex;i<=lastIndex;i++){
			helper[i] = a[i];
		}
		int i= firstIndex;
		int j = middleIndex+1;
		int k = firstIndex;
		
		while (i<=middleIndex && j<=lastIndex) {
			if(helper[i]<helper[j]){
				a[k] = helper[i];
				i++;
			}else{
				a[k] = helper[j];
				j++;
			}
			k++;
		}
		while (i<=middleIndex) {
			a[k] = helper[i];
			i++;
			k++;
		}
	}

}
