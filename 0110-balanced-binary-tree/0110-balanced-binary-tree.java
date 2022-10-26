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
    public boolean isBalanced(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null){
            return true;
        }
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            
            int h1 = getHeight(curr.left);
            int h2 = getHeight(curr.right);
            
            if(Math.abs(h1-h2) > 1){
                return false;
            }
            
            if(curr.left != null){
                q.add(curr.left);
            }
            
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        return true;
        
    }
    
    private int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int h1 = getHeight(root.left);
        int h2 = getHeight(root.right);
        return Math.max(h1, h2)+1;
    }
}