package leetcd;

import java.util.Arrays;

public class L2616 {
	public static int minimizeMax(int[] nums, int p) {
		Arrays.sort(nums);

		int start = 0;
		int end = Integer.MAX_VALUE;
		int diffAns = 0;

		while (start <= end) {
			int mid = end - (end - start) / 2;

			if (isPossible(nums, mid) >= p) {
				diffAns = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return diffAns;
	}

	public static int isPossible(int nums[], int target) {
		int count = 0;

		for (int i = 1; i < nums.length; i++) {
			if ((nums[i] - nums[i - 1]) <= target) {
				count++;
				i++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 2, 1, 2 };
		System.out.println(minimizeMax(arr, 1));
	}

}
