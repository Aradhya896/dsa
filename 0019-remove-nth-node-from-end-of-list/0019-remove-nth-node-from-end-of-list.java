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
/*class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode rev=reverse(head);
        int c=1;
        ListNode temp=rev;
         if (n == 1) {
            rev = rev.next;
          return reverse(rev);
         }
        while(temp!=null && temp.next!=null){
        
            if(c==n-1){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
            c++;

        }
        return reverse(rev);
    }
    ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode Next=null;

        while(curr!=null){
            Next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=Next;
        }
        return prev;
    }
}*/


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
         // ListNode dummy = new ListNode(0);
        //dummy.next = head;
        ListNode fast=head;
       
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
         if (fast == null) {
    return head.next;
}
        ListNode slow=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;

        }
        slow.next=slow.next.next;
    
    return head;
}}