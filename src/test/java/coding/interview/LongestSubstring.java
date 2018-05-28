package coding.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public int lengthOfLongestSubstring(String s) {
		int maxLen = 0;
		int currentLen = 0;
		int[] lastIndex = new int[128];
		Arrays.fill(lastIndex, -1);

		char c;
		for (int i = 0; i < s.length(); ++i) {
			c = s.charAt(i);
			currentLen = Math.min(i - lastIndex[c], currentLen + 1);
			maxLen = Math.max(maxLen, currentLen);
			lastIndex[c] = i;
		}

		return maxLen;
	}

	public int lengthOfLongestSubstring2(String str) {
		int strLength = str.length();
		Map<Character, Integer> result = new HashMap<>(256);

		int length = 0;
		int index = 0;
		int i = 0;
		while (i < strLength) {
			char val = str.charAt(i);
			if (result.containsKey(val)) {
				i = i - index + 1 + result.get(val);
				index = 0;
				result.clear();
			} else {
				result.put(val, index);
				i++;
				index++;
				length = Math.max(length, index);
			}
		}

		return length;
	}
}