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
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dia;
    }
    int dia = 0;
    public int height(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int ls = height(root.left);
        int rs = height(root.right);
        dia = Math.max((ls+rs),dia);
        return Math.max(ls,rs) + 1;
    }
}