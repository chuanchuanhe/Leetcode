/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * Example:
 * Input: 1->1->2
 * Output: 1->2
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tracker = head; 
        while (tracker != null && tracker.next != null)
        {
            if (tracker.val == tracker.next.val)
            {
                tracker.next = tracker.next.next;
            }
            else
            {
                tracker = tracker.next; 
            }
        }
        return dummy.next; 
    }
}