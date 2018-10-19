package coding.interview;

import java.util.Comparator;
import java.util.PriorityQueue;

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
        
        Comparator<ListNode> comparator = new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.val - o2.val;
			}
		};
        
        PriorityQueue<ListNode> q = new PriorityQueue<>(comparator);
        
        for (ListNode l: lists) {
        	if (l != null) {
        		q.add(l);
        	}
        }
        
        
        while (!q.isEmpty()) {
        	ListNode top = q.poll();
        	
        	
        }
        
        
        return dummyHead.next;
    }
}