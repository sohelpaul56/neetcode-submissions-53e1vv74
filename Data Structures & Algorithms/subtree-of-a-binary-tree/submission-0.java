class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (root==null) return false;
    if(issametree(root,subRoot)) return true;
    return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    private boolean issametree(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return issametree(p.left,q.left) && issametree(p.right,q.right);
    }
}
