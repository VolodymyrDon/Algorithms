package arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < n - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swapped = true;
					swap(arr, i);
				}
			System.out.println(Arrays.toString(arr));
			}
		}
	}
	private static void swap (int arr[], int index) {
		int temp = arr[index];
		arr[index] = arr[index + 1];
		arr[index + 1] = temp;
	} 
	public static void main(String args[]) {

		int arr[] = {5, 4, 3, 2, 1};
//		for (int i = 0; i < 5; i++) {
//			arr[i] = (int) (Math.random() * 100);
//		}
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(arr));
	}
}
