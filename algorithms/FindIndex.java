package arrays;

/*  Begin with the mid element of the whole array as a search key.
    
    If the value of the search key is equal to the item then return an index of the search key.
    
    Or if the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
    
    Otherwise, narrow it to the upper half.
    
    Repeatedly check from the second point until the value is found or the interval is empty.
 * 
 * */

import java.util.Arrays;

public class FindIndex {

	public static void main(String[] args) {
		int[] arr = { -1, 2, 4, 8, 9 };
		System.out.println(Arrays.toString(arr));
		//System.out.println("Element is found at " + findIndex(arr, 9));
		int value = 1;
		int result = binarySearch(arr, value);
		if (result == -1)
			System.out.println("There is no such element ");
		else
			System.out.printf("Element %d is found at index %d ", value, result);

	}

	public static int findIndex(int[] arr, int value) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
	
		return value;

	}

	// Simple binary search algorithm
	private static int binarySearch(int arr[], int value) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;

			// Check if value is present at mid
			if (arr[mid] == value)
				return mid;

			// If value greater, ignore left half
			if (arr[mid] < value)
				left = mid + 1;

			// If value is smaller, ignore right half
			else
				right = mid - 1;
		}

	
		return -1;
	}
	private static long getTime() {
		return System.currentTimeMillis();
	}

}