package searchingAlgorithms;

public class IterativeLinearSearch {
	
	private static int linearSearch(int[] a, int x) {
		
		int index =-1;
		
		for(int i = 0; i < a.length ; i++) {
			
			if(a[i] == x) {
				
				index = i;
				break;
			}
		}
		
		
		return index;
	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 8, 1 };
		int index = linearSearch(arr,5);
		
		if(index != -1) {
			System.out.println("Element Found at Index :"+index);
		}else {
			System.out.println("Element Not Found");
		}

	}

}
