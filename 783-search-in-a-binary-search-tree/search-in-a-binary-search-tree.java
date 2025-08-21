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
    public TreeNode searchBST(TreeNode root, int val) {
        /*if(root == null)
        {
            return null;
        }
        if(root.val == val)
        {
            return root;
        }
        if(val < root.val)
            return searchBST(root.left,val);
        if(val > root.val)
            return searchBST(root.right,val);
        return root;
    }
}*/
//Iterative
TreeNode curr = root;
while(curr != null)
{
    if(curr.val == val)
    {
        return curr;
    }
    else if(val < curr.val)
            return searchBST(curr.left,val);
        else 
            return searchBST(curr.right,val);
}
return null;
    }
}