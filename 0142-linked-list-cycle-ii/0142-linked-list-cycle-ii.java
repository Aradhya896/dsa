/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      /*  HashMap<ListNode, Integer>map=new HashMap<>();
//ListNode fast = head;
       // ListNode slow = head;
       // ListNode pos = new ListNode(-1);
        if (head == null ){
            return null;
        }ListNode temp=head;
        while(temp!=null){
            if(map.containsKey(temp)){
                return temp;
            }
        map.put(temp,map.getOrDefault(temp,0)+1);
        temp=temp.next;
        }

        return null;*/
         if (head == null ){
            return null;

         }
         ListNode fast=head;
         ListNode slow=head;
         while (fast != null && fast.next != null) {
            fast = fast.next.next;
             slow=slow.next; 
            if (slow==fast) {
               slow=head;
               while(slow!=fast){
               fast=fast.next;
            slow=slow.next;
            } 
             return slow; }
           
           
        }
       
        return null;
    }
}