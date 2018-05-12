package coding.interview;

public class RemoveDuplicatedInSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		while (fast != null) {
			if (fast.val != slow.val) {
				slow = slow.next;
				slow.val = fast.val;
			}
			fast = fast.next;
		}
		slow.next = null;
		return head;
	}
}
