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
    public ListNode addTwoNumbers(ListNode first, ListNode second) {
        int q = 0;
        int r = 0;
        int sum = 0;
        ListNode temp = null;
        ListNode head = null;

        while(first != null || second != null || q > 0){
            sum = q + (
                ((first != null) ? first.val : 0) +
                ((second != null) ? second.val : 0)
            );
            r = sum %10;
            q = sum /10;
            ListNode NewNode = new ListNode(r);
            if(head == null){
                head = NewNode;
            }
            else{
                temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = NewNode;
                // NewNode.next = null;
            }

            if(first != null){
                first = first.next;
            }
            if(second != null){
                second = second.next;
            }

        }
        return head;
    
    }
}