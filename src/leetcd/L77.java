package leetcd;

import java.util.LinkedList;
import java.util.List;

public class L77 {

	public void backtrack(int st, LinkedList<Integer> cur, int n, int k, List<List<Integer>> ls) {
		if (cur.size() == k) {
			ls.add(new LinkedList(cur));
		}
		for (int i = st; i <= n && cur.size() < k; i++) {
			cur.add(i);
			backtrack(i + 1, cur, n, k, ls);
			cur.removeLast();
		}
	}

	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> ls = new LinkedList();
		if (k == 0) {
			ls.add(new LinkedList());
			return ls;
		}
		backtrack(1, new LinkedList(), n, k, ls);
		return ls;
	}

	public static void main(String[] args) {
		System.out.println(new L77().combine(4, 2).toString());
	}

}
