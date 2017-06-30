package org.bhoopendra.learning.algos;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 3, 6, 8, 9 };
		new MergeSort().mergeSort(arr, 0, 5);
		for(int item : arr){
			System.out.println(item);
		}
	}

	private void mergeSort(int arr[], int first, int last) {
		int middle = first + (last - first) / 2;
		if (first < last) {
			mergeSort(arr, first, middle);
			mergeSort(arr, middle + 1, last);
			merge(arr, first, middle, last);
		}

	}

	private void merge(int arr[], int first, int middle, int last) {
		int helper[] = new int[arr.length];
		for (int i = first; i <= last; i++) {
			helper[i] = arr[i];
		}
		int i = first;
		int j = middle + 1;
		int k = first;

		while (i <= middle && j <= last) {
			if (helper[i] <= helper[j]) {
				arr[k] = helper[i];
				i++;
			} else {
				arr[k] = helper[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			arr[k] = helper[i];
			i++;
			k++;
		}
	}
}
