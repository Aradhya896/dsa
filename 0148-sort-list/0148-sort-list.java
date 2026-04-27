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
import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer>al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(al);
        ListNode c=head;
        while(c!=null){
            for(int i=0;i<al.size();i++){
            c.val=al.get(i);
            c=c.next;
        }}
        return head;
    }
}