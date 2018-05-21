package coding.interview;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummyHead = new ListNode(0);
        ListNode c = dummyHead;
        
        while (isNotDone(lists)) {
        	int minIndex = getMinIndex(lists);
        	c.next = lists[minIndex];
        	c = c.next;
        	lists[minIndex] = lists[minIndex].next;
        }
        
        return dummyHead.next;
    }

	private int getMinIndex(ListNode[] lists) {
		Integer minIndex = null;
		for (int i = 0; i < lists.length; ++i) {
			if (lists[i] != null && (minIndex == null || lists[i].val < lists[minIndex].val)) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	private boolean isNotDone(ListNode[] lists) {
		for (ListNode l: lists) {
			if (l != null) {
				return true;
			}
		}
		return false;
	}
}