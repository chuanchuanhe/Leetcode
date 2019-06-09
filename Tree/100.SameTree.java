/**
 * Given two binary trees, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical and the nodes have the 
 * same value.
 * Example: true
 *         1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//solution: recursion
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // TreeNode p and q are both null
        if (p == null && q == null)
        {
            return true;
        }
        //one of TreeNode p and q ia null
        else if (p == null || q == null)
        {
            return false;
        }
        else if (p.val != q.val)
        {
            return false;
        }
        else 
        {
            return (isSameTree(p.right, q.right) && isSameTree(p.left, q.left));
        }
        
    }
}
