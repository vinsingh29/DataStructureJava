package searchingAlgorithms;

public class RecursiveBinarySearch {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 8, 1 };
		int index = binarySearch(arr, 0, arr.length - 1, 50);

		if (index != -1) {
			System.out.println("Element Found at Index :" + index);
		} else {
			System.out.println("Element Not Found");
		}

	}

	private static int binarySearch(int[] arr, int low, int high, int x) {
		int mid = (low + high) / 2;

		if (high < low) {
			return -1;
		}

		if (x == arr[mid]) {
			return mid;
		}

		if (x < arr[mid]) {

			return binarySearch(arr, 0, mid - 1, x);
		} else {
			return binarySearch(arr, mid + 1, high, x);
		}

	}

}
