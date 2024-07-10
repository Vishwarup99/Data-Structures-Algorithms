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
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head, fast = head;

    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverse(slow);

        ListNode firstHalf = head;
        ListNode secondHalfIter = secondHalf;
        while (secondHalfIter != null) {
            if (firstHalf.val != secondHalfIter.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalfIter = secondHalfIter.next;
        }

        return true;
    }

    private ListNode reverse(ListNode current) {
        ListNode prev = null, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
