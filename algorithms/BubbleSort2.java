package arrays;

import java.util.Arrays;

public class BubbleSort2 {
	public static void bubbleSort(int arr[]) {
		int lastSwap = arr.length - 1;
		for (int i = 1; i < arr.length; i++) {
			boolean swapped = true;
			int currentSwap = -1;

			for (int j = 0; j < lastSwap; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j);
					swapped = false;
					currentSwap = j;
				}
				System.out.printf("Loop(%d,%d); %s%n", i, j, Arrays.toString(arr));
			}
			if (swapped) {
				return;
			}
			lastSwap = currentSwap;
		}
	}

	private static void swap(int arr[], int index) {
		int temp = arr[index];
		arr[index] = arr[index + 1];
		arr[index + 1] = temp;
	}

	public static void main(String args[]) {

		int arr[] = { 1, -1, 3, 2, 6, 5, 7 };
		// for (int i = 0; i < 5; i++) {
		// arr[i] = (int) (Math.random() * 100);
		// }
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(arr));
	}
}
