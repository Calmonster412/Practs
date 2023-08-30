package leetcd;

public class L2490 {

	public static boolean isCircularSentence(String sentence) {
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {
				if(sentence.charAt(i-1) != sentence.charAt(i+1))
					return false;
			}
		}
		return sentence.charAt(0) == sentence.charAt(sentence.length()-1);
	}

	public static void main(String[] args) {
		isCircularSentence("leetcode eats soul");
	}

}
