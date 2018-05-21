package coding.interview;

class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode c = dummyHead;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				c.next = l1;
				l1 = l1.next;
			} else {
				c.next = l2;
				l2 = l2.next;
			}
			c = c.next;
		}
		
		if (l1 != null) {
			c.next = l1;
		}
		
		if (l2 != null) {
			c.next = l2;
		}
		
		return dummyHead.next;
	}
}