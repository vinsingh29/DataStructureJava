package searchingAlgorithms;

public class IterativeBinarySearch {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 8, 1 };
		int index = iterativeBinarySearch(arr, 50);

		if (index != -1) {
			System.out.println("Element Found at Index :" + index);
		} else {
			System.out.println("Element Not Found");
		}

	}

	public static int iterativeBinarySearch(int[] array, int key) {

		int start = 0;
		int end = array.length - 1;

		while (start <= end) {

			int middle = (start + end) / 2;

			if (key < array[middle]) {
				end = middle - 1;
			}

			if (key > array[middle]) {
				start = middle + 1;
			}

			if (key == array[middle]) {
				return middle;
			}
		}
		return -1;

	}

}
