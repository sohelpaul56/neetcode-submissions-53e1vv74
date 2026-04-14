class Solution {
    public int maxDepth(TreeNode root) {
        return height(root);
    }
    private int height(TreeNode root){
       if(root==null) return 0;
       int l=height(root.left);
       int r=height(root.right);
       return 1+Math.max(l,r);
    }
}

