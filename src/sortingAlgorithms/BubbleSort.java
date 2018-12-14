package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

	private static void bubbleSortAlgo(int[] a) {
		int n = a.length;

		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {

					swap(a, j);
				}
			}
	}

	private static void swap(int[] a, int j) {
		int temp = a[j];
		a[j] = a[j + 1];
		a[j + 1] = temp;
	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 8, 1 };
		System.out.println("Before Swap" + " " + Arrays.toString(arr));
		bubbleSortAlgo(arr);
		System.out.println("After Swap" + "  " + Arrays.toString(arr));

	}

}


