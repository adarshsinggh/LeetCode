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
        int carry = 0;
        ListNode l3 = new ListNode();
        ListNode pointer = l3;
        while(l1 != null || l2 != null || carry != 0){
            int l1Val;
            int l2Val;

            if(l1 == null){
                l1Val = 0;
            }else{
                l1Val = l1.val;
            }
            if(l2 == null){
                l2Val = 0;
            }else{
                l2Val = l2.val;
            }

            int sum = l1Val + l2Val + carry;
            if(sum>9){
                carry = 1;
                sum = sum%10;
            }else{
                carry = 0;
            }

            pointer.val = sum;

            
            if(l1 != null && l1.next != null){
                l1 = l1.next;
            }else{
                l1 = null;
            }
            if(l2 != null && l2.next != null){
                l2 = l2.next;
            }else{
                l2 = null;
            }
            if(l1 != null || l2 != null || carry != 0){
                pointer.next = new ListNode();
                pointer = pointer.next;
            }

        }
        return l3;
    } 
}