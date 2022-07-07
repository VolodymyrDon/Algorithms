package arrays;

import java.util.Arrays;

public class SelectionSort {

	private static void swap(int arr[], int index, int minimum) {
		int temp = arr[index];
		arr[index] = arr[minimum];
		arr[minimum] = temp;
	}
	private static void selectonSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int minValue = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minValue] > arr[j]) {
					minValue = j;
				}
			}
			if(minValue !=i) {
				swap(arr, i, minValue);
			}
		}

	}
	public static void main(String[] args) {
		int[] arr = { 1, 9, 0, 2, 8, 7, 4 };
		System.out.println(Arrays.toString(arr));
		selectonSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
