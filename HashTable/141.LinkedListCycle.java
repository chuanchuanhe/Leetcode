/**
Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.

Example 2:

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the first node.

Example 3:

Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.


Intuition:
To detect if a list is cyclic, we can check whether a node had been visited before. A natural way is to use a hash table.
We go through each node one by one and record each node's reference (or memory address) in a hash table. 
If the current node is null, we have reached the end of the list and it must not be cyclic. 
If current node’s reference is in the hash table, then return true.
 */

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

//Solution1: HashTable Time compexity O(n), SPace Complexity: O(n)
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        while (head != null) {
            if (hs.contains(head)) {
                return true;
            }
            else {
                hs.add(head); 
                head = head.next;
            }
        }
        return false; 
    }
}

