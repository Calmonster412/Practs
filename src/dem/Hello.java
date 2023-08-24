package dem;

import java.util.Arrays;

public class Hello {

	public static void reorderSpaces(String text) {

		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ')
				count++;
		}
		String[] sts = text.trim().split(" ");
		System.out.println(Arrays.toString(sts) +" : "+Arrays.toString(sts));
	}

	public static void main(String[] args) {
		reorderSpaces("  this   is  a sentence ");
	}

}
