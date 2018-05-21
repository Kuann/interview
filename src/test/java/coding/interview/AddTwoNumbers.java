package coding.interview;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode c = dummyHead;
		int r = 0;
		
		while (l1 != null || l2 != null) {
			int v1 = l1 != null ? l1.val : 0;
			int v2 = l2 != null ? l2.val : 0;
			int v = (v1 + v2 + r) % 10;
			r = (v1 + v2 + r) / 10;
			c.next = new ListNode(v);
			c = c.next;
			
			if (l1 != null) {
				l1 = l1.next;
			}
			
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		
		if (r != 0) {
			c.next = new ListNode(r);
		}
		
		return dummyHead.next;
	}
}