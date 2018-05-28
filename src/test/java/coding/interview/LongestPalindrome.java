package coding.interview;

class LongestPalindrome {
	public String longestPalindrome(String s) {
		if (s.length() < 2) {
			return s;
		}

		int[] maxLen = new int[s.length()];
		maxLen[0] = 1;

		for (int i = 1; i < s.length(); ++i) {
			int pIndex = i - 1 - maxLen[i - 1];

		}

		return null;
	}
}