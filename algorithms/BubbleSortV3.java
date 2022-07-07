package arrays;

import java.util.Arrays;

public class BubbleSortV3 {
	private static void bubbleSort(int arr[]) {
		 int lastSwap = arr.length - 1;
		 boolean swapped = true;
		 int currentSwap = -1;
		 while(swapped){
		       swapped = false;
		        for (int j = 0; j < lastSwap; j++) {
		            if (arr[j] > arr[j + 1]) {
		                swap(arr, j);
		                swapped = true;
		                currentSwap = j;
		            }
		            System.out.printf("Loop(%d); %s%n", j, Arrays.toString(arr));
		        }
		        lastSwap = currentSwap;
		 }
	}
	private static void swap (int arr[], int index) {
		int temp = arr[index];
		arr[index] = arr[index + 1];
		arr[index + 1] = temp;
	} 
	
	public static void main(String args[]) {

		int arr[] = {1, -1, 3, 2, 6, 4, 7};
//		for (int i = 0; i < 5; i++) {
//			arr[i] = (int) (Math.random() * 100);
//		}
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
	
	
	
}
