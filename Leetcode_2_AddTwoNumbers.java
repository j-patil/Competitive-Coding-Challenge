/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        int carry = 0;
        ListNode temp = new ListNode(0);
        ListNode sample = temp;
        while(l1!=null || l2!=null){
            
            carry /= 10;
            
            if(l1!=null){
                carry += l1.val;
                l1 = l1.next;
            }
            
            if(l2!=null){
                carry += l2.val;
                l2 = l2.next;
            }
            
            sample.next = new ListNode(carry%10);
            sample = sample.next;
        }
        
        if(carry/10 == 1) sample.next = new ListNode(1);
        return temp.next;
    }
}