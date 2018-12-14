package array;

import java.util.Arrays;

public class TwoSum_Iteration {

	public static int[] findTwoSum(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int[] res = new int[2];

		while (left < right) {
			int sum = nums[left] + nums[right];
			if (sum == target) {
				res[0] = nums[left];
				res[1] = nums[right];
				return res;
			} else if (sum > target) {
				right--;
				while (left < right && nums[right] == nums[right - 1]) {
					System.out.println("in while");
					right--;
				}

			} else {

				left++;

				while (left < right && nums[left] == nums[left + 1]) {

					left++;
				}
			}

		}

		return null;

	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15, 15 };
		System.out.println(Arrays.toString(findTwoSum(nums, 9)));

	}

}
