package arrays;

import java.util.Arrays;

public class InsertionSort {
	public static void insertion(int numbers[]) {
		for (int i = 1; i < numbers.length; i++) {
			int currValue = numbers[i];
			int indexBefore = i - 1;
			while (indexBefore >= 0 && numbers[indexBefore] > currValue) {
				numbers[indexBefore + 1] = numbers[indexBefore];
				indexBefore--;
			}
			numbers[indexBefore + 1] = currValue;
		}

	}

	public static void main(String[] args) {
		int arr[] = new int [5] ;
		for (int i = 0; i < 5; i++) {
		arr[i] = (int) (Math.random() * 100);
	}
		System.out.println("Unsorted" + Arrays.toString(arr));
		insertion(arr);
		System.out.println("Sorted" + Arrays.toString(arr));
	}

}
