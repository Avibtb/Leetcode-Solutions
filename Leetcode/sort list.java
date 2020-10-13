class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode tail = head;
        while(fast != null && fast.next != null) {
            tail = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        tail.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        
        return merge(left, right);
    }
    public ListNode merge(ListNode left, ListNode right) {
        ListNode merged = new ListNode(0);
        ListNode current_node = merged;
        
        while (left != null && right != null) {
            if (left.val < right.val) {
                current_node.next = left;
                left = left.next;
            } else {
                current_node.next = right;
                right = right.next;
            }
            current_node = current_node.next;
        }
        if (left != null) {
            current_node.next = left;
        } else {
            current_node.next = right;
        }
        return merged.next;
    }
}