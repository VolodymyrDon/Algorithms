package arrays;

import java.util.Arrays;

public class FindMinMaxValue {
	public static void main(String[] args) {
		int[][] arr = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 }, { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
		System.out.println(Arrays.toString(getAnswers(arr)));
		System.out.println(getMaxValue(arr));
		System.out.println(getMinValue(arr));
	}

public static int[] getAnswers(int[][] arr) {

	int data[] = new int[2];
	data[0]= getMaxValue(arr);
	data[1] = getMinValue(arr);
	return data;

}

	public static int getMaxValue(int[][] numbers) {
		int maxValue = numbers[0][0];
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers[j].length; i++) {
				if (numbers[j][i] > maxValue) {
					maxValue = numbers[j][i];
				}
			}
		}
		return maxValue;

	}

	public static int getMinValue(int[][] numbers) {
		int minValue = numbers[0][0];
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers[j].length; i++) {
				if (numbers[j][i] < minValue) {
					minValue = numbers[j][i];
				}
			}
		}
		return minValue;
	}
}
