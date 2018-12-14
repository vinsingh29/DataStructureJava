package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_HashMap {

	public static int[] find2Sum(int[] arr, int target) {

		int res[] = new int[2];

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		if (arr.length < 2)
			return null;

		for (int i = 0; i < arr.length; i++) {
			int diff = target - arr[i];

			if (map.containsKey(diff)) {

				res[0] = map.get(diff);
				res[1] = i;
				return res;

			} else {

				map.put(arr[i], i);// key = element at a[i] and value = index of the element
			}

		}

		return null;
	}

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		
		int[] result = find2Sum(nums, 9);
		
		System.out.println(Arrays.toString(result));

	}

}
