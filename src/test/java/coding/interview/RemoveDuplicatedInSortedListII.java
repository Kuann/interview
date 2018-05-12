package coding.interview;

public class RemoveDuplicatedInSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode dummyHead = new ListNode(0);
		ListNode tail = dummyHead;
		ListNode prev = null;
		ListNode current = head;

		while (current != null) {

			if ((prev == null || current.val != prev.val)
					&& (current.next == null || current.next.val != current.val)) {
				tail.next = current;
				tail = current;
			}

			prev = current;
			current = current.next;
		}
		
		tail.next = null;
		return dummyHead.next;
	}
}
