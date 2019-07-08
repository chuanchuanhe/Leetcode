/**

 */



class Solution{
    public int sumNumbers(TreeNode root) {
        if(root == null) {
            return 0;
        }
        else {
            return dfs(0, root); 
        }
    }
    public int dfs(int counter, TreeNode node) {
        int newCounter = counter * 10 + node.val; 
        if (node.left == null && node.right == null) {
            return newCounter;
        }
        int sum = 0; 
        if (node.left != null) {
            sum = sum + dfs(newCounter, node.left);
        }
        if (node.right != null) {
            sum = sum + dfs(newCounter, node.right); 
        }
        return sum; 
    }
}