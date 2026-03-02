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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        while (true) {
            // Check if there are at least k nodes left
            ListNode count = prev;
            for (int i = 0; i < k; i++) {
                count = count.next;
                if (count == null) {
                    return dummy.next;
                }
            }
            
            // Reverse the k nodes
            ListNode curr = prev.next;
            ListNode next = curr.next;
            for (int i = 0; i < k - 1; i++) {
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            
            // Move prev to the end of the reversed group
            prev = curr;
        }
    }
}