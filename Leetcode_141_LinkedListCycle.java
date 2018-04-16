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
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        if(head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null){
            if(slow.val == fast.val) return true;
            else{
                slow = slow.next;
                if(fast.next == null) return false;
                else fast = fast.next.next;
            }
        }
        return false;
    }
}