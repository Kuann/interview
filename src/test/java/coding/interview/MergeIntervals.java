package coding.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> res = new ArrayList<>(intervals.size());

		if (intervals.isEmpty()) {
			return res;
		}

		intervals.sort((f, s) -> f.start - s.start);

		Interval last = intervals.get(0);
		res.add(last);

		for (Interval i : intervals) {
			if (i.start <= last.end) {
				if (i.end > last.end) {
					last.end = i.end;
				}
			} else {
				res.add(i);
				last = i;
			}
		}

		return res;
	}

	@Test
	public void test() {
		merge(Arrays.asList(new Interval(2, 5), new Interval(3, 5)));
	}
}