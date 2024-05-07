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
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        int val = 0;

        while(temp!= null){
            stack.push(temp.val);
            temp = temp.next;
        }

        ListNode newTail = null;

        while(!stack.isEmpty() || val != 0){
            newTail = new ListNode(0, newTail);

            if(!stack.isEmpty()){
                val = val + stack.pop() * 2;
            }
            newTail.val = val %10;
            val = val/10;
        }

        return newTail;
    }
}