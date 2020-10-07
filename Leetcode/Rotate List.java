/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
		return head;
	}
	int n = 1; // list len
	// link tail to head
	var cur = head;
	while (cur.next != null) {
		cur = cur.next;
		n++;
	}
	cur.next = head;

	k = k % n; // make sure k < n
	k = n - k; // now we can move to the right
	cur = head;
	for (int i = 0; i < k - 1; i++) {
		cur = cur.next;
	}
	head = cur.next;
	cur.next = null;

	return head;
        
    }
}