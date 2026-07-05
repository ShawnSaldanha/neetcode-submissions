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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        if(isSameTree(root , subRoot)){
            return true;
        }
        return isSubtree(root.left , subRoot) || isSubtree(root.right , subRoot);
    }
    public boolean isSameTree(TreeNode mainTreeNode , TreeNode subTreeNode){
        if(mainTreeNode == null && subTreeNode == null){
            return true;
        }
        if(mainTreeNode == null || subTreeNode == null || mainTreeNode.val != subTreeNode.val){
            return false;
        }
        return isSameTree(mainTreeNode.left , subTreeNode.left) && isSameTree(mainTreeNode.right , subTreeNode.right);
    }
}
