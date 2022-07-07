package arrays;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

  public static void main(String[] args) {

		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		System.out.println("Unsorted " + Arrays.toString(arr));
		quicksort(arr);
		System.out.println("Sorted " + Arrays.toString(arr));
		
  }

  private static void quicksort(int[] array) {
    quicksort(array, 0, array.length - 1);
  }

  private static void quicksort(int[] array, int lowIndex, int highIndex) {

    if (lowIndex >= highIndex) {
      return;
    }

    int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
    int pivot = array[pivotIndex];
    swap(array, pivotIndex, highIndex);

    int leftPointer = partition(array, lowIndex, highIndex, pivot);

    quicksort(array, lowIndex, leftPointer - 1);
    quicksort(array, leftPointer + 1, highIndex);

  }

  private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
    int leftPointer = lowIndex;
    int rightPointer = highIndex - 1;

    while (leftPointer < rightPointer) {

      // Walk from the left until we find a number greater than the pivot, or hit the right pointer.
      while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
        leftPointer++;
      }

      // Walk from the right until we find a number less than the pivot, or hit the left pointer.
      while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
        rightPointer--;
      }

      swap(array, leftPointer, rightPointer);
    }
    
    // This is different from what the video has, and fixes an issue where the last value could potentially be out of order. 
   
    if(array[leftPointer] > array[highIndex]) {
      swap(array, leftPointer, highIndex);
    }
    else {
      leftPointer = highIndex;
    }
    
    return leftPointer;
  }

  private static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}