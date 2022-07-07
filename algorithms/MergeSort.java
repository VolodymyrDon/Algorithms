package arrays;

import java.util.Arrays;

public class MergeSort {
	static int counter = 0;

	public static void main(String[] args) {
		int arr[] = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * arr.length);
		}
		System.out.println("Unsorted " + Arrays.toString(arr));
		mergeSort(arr);
		System.out.println("Sorted " + Arrays.toString(arr));
		System.out.println(counter);
	}

	private static void mergeSort(int arr[]) {
		int arrayLength = arr.length;
		if (arrayLength < 2) {
			return;
		}
		int midPoint = arrayLength / 2;
		int[] left = new int[midPoint]; /*
										 * Позбутися цих двох масивів, використовувати тільки temp та вхідний
										 */
		int[] right = new int[arrayLength - midPoint];

		// all elements of the left half of starting array is now in the left[]
		for (int i = 0; i < midPoint; i++) {
			left[i] = arr[i];
		}
		// same for right
		for (int i = midPoint; i < arrayLength; i++) {
			right[i - midPoint] = arr[i];
		}

		mergeSort(left);
		mergeSort(right);
		counter++;

		merge(arr, left, right);

	}

	private static void merge(int[] arr, int[] left, int[] right) {
		int leftSize = left.length;
		int rightSize = right.length;

		// l - index for a left side, r - for the right side, m - for the merged array
		int l = 0, r = 0, m = 0;
		while (l < leftSize && r < rightSize) {
			// adding either left of right element to the merged array
			if (left[l] <= right[r]) {
				arr[m] = left[l];
				l++;
			} else {
				arr[m] = right[r];
				r++;
			}
			// incrementing merged array
			m++;
		}
		// adding remaining elements in either left or right arrays
		while (l < leftSize) {
			arr[m] = left[l];
			l++;
			m++;
		}
		while (r < rightSize) {
			arr[m] = right[r];
			r++;
			m++;
		}
	}

}
