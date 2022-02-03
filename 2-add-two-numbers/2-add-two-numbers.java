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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode dummy=new ListNode(0);
		 ListNode result=dummy;
		 int carry=0;
		 while(l1!=null || l2!=null) {
			 int total=carry;
			 if(l1!=null) {
				 total+=l1.val;
				 l1=l1.next;
			 }
			 if(l2!=null) {
				 total+=l2.val;
				 l2=l2.next;
			 }
			 
			 result.next=new ListNode(total%10);
			 carry=total/10;
			 result=result.next;
		 }
		 
		 if(carry!=0) {
			 result.next=new ListNode(carry);
		 }
		return dummy.next;
        
    }
}