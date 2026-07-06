/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root , root.val);
    }
    public int dfs(TreeNode node , int maxSoFar){
        if(node == null){
            return 0;
        }
        int goodNodeCounter = 0;
        if(node.val >= maxSoFar){
            goodNodeCounter += 1;
            maxSoFar = node.val;
        }
        goodNodeCounter += dfs(node.left , maxSoFar);
        goodNodeCounter += dfs(node.right , maxSoFar);
        return goodNodeCounter;
    }
}
