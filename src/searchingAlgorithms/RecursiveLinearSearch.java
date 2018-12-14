package searchingAlgorithms;

public class RecursiveLinearSearch {


	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 8, 1 };
		int index = recursiveLinearSearch(arr,0,arr.length-1,5);
		
		if(index != -1) {
			System.out.println("Element Found at Index :"+index);
		}else {
			System.out.println("Element Not Found");
		}

	}

	private static int recursiveLinearSearch(int[] a, int low, int high, int key) {
		
		if(high < low) return -1;
		if(a[low] == key) return low;	
		if(a[high] == key) return high;
		
		return recursiveLinearSearch(a, low+1, high-1, key);
		
		
	}

}
