package sortingAlgorithms;

import java.util.Arrays;

public class HeapSort {

	@SuppressWarnings("unused")
	private static int parentIdx(int i) {
		return (i - 1) / 2;
	}

	private static int leftIdx(int i) {
		return 2 * i + 1;
	}

	private static int rightIdx(int i) {
		return 2 * i + 2;
	}

	public static void maxHeapify(int[] A, int i, int heapMaxIdx) {
		int L = leftIdx(i);
		int R = rightIdx(i);
		int largest = i;
		if (L <= heapMaxIdx && A[L] > A[i]) {
			largest = L;
		}
		if (R <= heapMaxIdx && A[R] > A[largest]) {
			largest = R;
		}
		if (largest != i) {
			swap(A, i, largest);
			maxHeapify(A, largest, heapMaxIdx);
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}
	// Build Max Heap => O(n)
	public static void buildMaxHeap(int[] A) {
		int heapMaxIdx = A.length - 1;
		for (int i = heapMaxIdx / 2; i >= 0; i--) {
			maxHeapify(A, i, heapMaxIdx);
		}
	}
	//Heap Sort Takes => O(n log n)
	public static void heapSortAlgo(int[] A) {
		int heapMaxIdx = A.length - 1;
		buildMaxHeap(A);//O(n)
		for (int i = A.length - 1; i > 0; i--) {
			swap(A, 0, i);
			heapMaxIdx--;
			maxHeapify(A, 0, heapMaxIdx); //O(log n)
		}
	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 8, 1 };
		System.out.println("Before Swap" + " " + Arrays.toString(arr));
		heapSortAlgo(arr);
		System.out.println("After Swap" + "  " + Arrays.toString(arr));

	}

}