/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up 
 * all the values along the path equals the given sum.
 * Note: A leaf is a node with no children.
 * Given the below binary tree and sum = 22,
 *    5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1

5->4->11->2 which sum is 22
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
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return helper(root, 0, sum); 
    }
    public boolean helper(TreeNode root, int c, int sum) {
        if ((root != null) && (root.left == null) && (root.right == null) && (root.val+c==sum))
        {
            return true;
        }
        if (root != null)
        {
            if (helper(root.left, c+root.val, sum) == true)
            {
                return true;
            }
            if (helper(root.right, c+root.val, sum) == true)
            {
                return true; 
            }
        }
          return false;  
    }
}
       
