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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer>al=new ArrayList<>();
        
        if(head==null || head.next==null){
            return true;
        }ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        int s=0;
        int l=al.size()-1;
        while(s<=l){
            if(al.get(s)!=al.get(l)){
                return false;
                
                

            }
            s++;
            l--;
        }
        return true;
        
    }
}