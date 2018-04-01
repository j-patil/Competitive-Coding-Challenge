/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/*
Alternate ways:
1. Calculate length; make the lists equidistant; then check elements
2. Use hashset, put all elements of one list, then check for false add() on hashset for other list

*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        while(a!=b){
            if(a == null) a = headB; else a = a.next;
            if(b == null) b = headA; else b = b.next;
        }
        return a;
    }
}