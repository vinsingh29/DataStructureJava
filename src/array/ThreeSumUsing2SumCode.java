package array;

import java.util.ArrayList;
import java.util.Arrays;
import array.TwoSum_Iteration;

public class ThreeSumUsing2SumCode {

	public static ArrayList<int[]> threeSum(int[] arr) {
		
		Arrays.sort(arr);
		int target = 0;
		

		for (int i = 0; i < arr.length - 3; i++) {
			int target2Sum = target - arr[0];
			System.out.println(target2Sum);
			int[] res = TwoSum_Iteration.findTwoSum(arr, target2Sum);
			System.out.println(res[0]);
			System.out.println(res[1]);
			

		}

		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
