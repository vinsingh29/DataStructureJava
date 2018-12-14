package sortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	private static void quickSortAlgo(int[] a, int start, int end) {

		int partitionIndex;

		if (start < end) {

			partitionIndex = partition(a, start, end);
			quickSortAlgo(a, start, partitionIndex - 1);
			quickSortAlgo(a, partitionIndex + 1, end);
		}

	}

	private static int partition(int[] a, int start, int end) {

		int pivot = getPivot(start, end);
		int pIndex = start;

		for (int i = start; i < end; i++) {
			if (a[i] <= pivot) {
				swap(a, i, pIndex);
				pIndex++;
			}

		}
		swap(a, pIndex, end);
		return pIndex;
	}
	
	private static int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high - low) + 1) + low;
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

	public static void main(String[] args) {

		int[] arr = { 9, 5, 2, 10, 4, 15 };
		System.out.println("Before Swap" + " " + Arrays.toString(arr));
		quickSortAlgo(arr, 0, arr.length - 1);
		System.out.println("After Swap" + "  " + Arrays.toString(arr));

	}

}
