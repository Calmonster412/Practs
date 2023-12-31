package leetcd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L139 {

	public static boolean wordBreak(String s, List<String> wordDict) {
		Set<String> wordDictSet = new HashSet(wordDict);
		boolean[] dp = new boolean[s.length() + 1];

		dp[0] = true;
		for (int end = 1; end <= s.length(); end++) {
			for (int start = 0; start < end; start++) {
				System.out.println(start+"::"+end+" - "+s.substring(start, end));
				if (dp[start] && wordDictSet.contains(s.substring(start, end))) {
					System.out.print(s.substring(start,end));
					dp[end] = true;
					break;
				}
			}
			System.out.println(Arrays.toString(dp));
		}

		return dp[s.length()];
	}

	public static void main(String[] args) {
		List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");
		System.out.println(wordBreak("catsandog", wordDict));
	}

}
