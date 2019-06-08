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