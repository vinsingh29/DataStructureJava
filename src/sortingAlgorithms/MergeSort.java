package sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

	private static void merge(int[] a, int low, int mid, int high) {

		int n1 = mid - low + 1;
		int n2 = high - mid;
		int i, j, k;

		int[] left_array = new int[(n1 + 1)];
		int[] right_array = new int[(n2 + 1)];

		for (i = 0; i < n1; i++) {
			left_array[i] = a[low + i];
		}

		for (j = 0; j < n2; j++) {
			right_array[j] = a[mid + j + 1];
		}

		while (i == n1) {
			left_array[i] = 9999;
			break;
		}

		while (j == n2) {
			right_array[j] = 9999;
			break;
		}

		i = 0;
		j = 0;

		for (k = low; k <= high; k++) {
			if (left_array[i] <= right_array[j]) {
				a[k] = left_array[i];
				i++;
			} else {
				a[k] = right_array[j];
				j++;
			}
		}
	}

	private static void mergeSortAlgo(int[] a, int low, int high) {

		int mid;
		if (low < high) {

			mid = (low + high) / 2;
			mergeSortAlgo(a, low, mid);
			mergeSortAlgo(a, mid + 1, high);
			merge(a, low, mid, high);

		}

	}

	public static void main(String[] args) {

		int[] arr = { 4, 3, 2, 5 };
		System.out.println("Before Swap" + " " + Arrays.toString(arr));
		mergeSortAlgo(arr, 0, arr.length - 1);
		System.out.println("After Swap" + "  " + Arrays.toString(arr));

	}

}
