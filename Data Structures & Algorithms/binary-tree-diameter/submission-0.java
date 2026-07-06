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
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxHeight(root);
        return maxDiameter;
    }
    public int maxHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int maxHeightLeft = maxHeight(root.left);
        int maxHeightRight = maxHeight(root.right);
        maxDiameter = Math.max(maxDiameter , maxHeightLeft + maxHeightRight);
        return 1 + Math.max(maxHeightLeft , maxHeightRight);
    }
}
