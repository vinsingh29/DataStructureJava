package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

	private static void selectionSortAlgo(int[] a) {
			
		int min, pos;
		int n = a.length;
		
		for(int i =0 ; i < n-1; i++) {
			min = a[i];
			pos = i;
			
			for(int j = i+1 ; j < n ; j++) {
				
				if(min > a[j])
					min = a[j];
					pos = j;
			}
			
			a[pos] = a[i];
			a[i] = min;
			
		}
	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 8, 1 };
		System.out.println("Before Swap" + " " + Arrays.toString(arr));
		selectionSortAlgo(arr);
		System.out.println("After Swap" + "  " + Arrays.toString(arr));

	}

}




