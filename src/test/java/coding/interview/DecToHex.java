package coding.interview;

import java.util.Arrays;

import org.junit.Test;

public class DecToHex {
	private static final char[] MAP = { '0', '0' + 1, '0' + 2, '0' + 3, '0' + 4, '0' + 5, '0' + 6, '0' + 7, '0' + 8,
			'0' + 9, 'a', 'b', 'c', 'd', 'e', 'f' };

	public String toHex(int num) {
		char[] res = new char[8];
		
		int count = 0;
		for (int i = 0; i < 8; ++i) {
			int val = (num << 4 * i) >>> 28;
			if (count > 0 || val > 0) {
				res[count++] = (char) MAP[val];
			}
		}
		
		char[] r = Arrays.copyOf(res, count);
		r = r.length > 0 ? r : new char[] {'0'};
		
		return String.valueOf(r);	
	}
	
	@Test
	public void t() {
		System.out.println(toHex(1));
	}
}
