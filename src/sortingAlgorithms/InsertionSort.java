package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

	private static void insertionSortAlgo(int[] a) {

		int n = a.length;
		int key;

		for (int i = 0; i < n - 1; i++) {

			key = a[i + 1];
			int j = i + 1;

			while (j > 0 && a[j - 1] > key) {
				a[j] = a[j - 1];
				j--;

			}
			a[j] = key;
		}

	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 8, 1 };
		System.out.println("Before Swap" + " " + Arrays.toString(arr));
		insertionSortAlgo(arr);
		System.out.println("After Swap" + "  " + Arrays.toString(arr));

	}

}

