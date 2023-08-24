package leetcd;

import java.util.ArrayList;
import java.util.List;

public class L46 {

	private static void backtrack(List<List<Integer>> res, ArrayList<Integer> temp, int[] nums) {
		if (temp.size() == nums.length) {
			res.add(new ArrayList<>(temp));
			return;
		}
		for (int n : nums) {

			System.out.println(n+":-:"+temp.toString());
			if (temp.contains(n))
				continue;

			temp.add(n);
			backtrack(res, temp, nums);
			temp.remove(temp.size() - 1);
			System.out.println(n+"::"+res.toString());
		}
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		backtrack(res, new ArrayList<>(), nums);
		return res;
	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3 };
		permute(num);
	}

}
