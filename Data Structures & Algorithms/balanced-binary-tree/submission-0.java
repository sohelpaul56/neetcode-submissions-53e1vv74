class Solution {
    public boolean isBalanced(TreeNode root) {
        
        if(getheight(root)!=-1) return true;
        return false;
    }
    private int getheight(TreeNode root){
        if(root==null) return 0;
        int lst=getheight(root.left);
        int rst=getheight(root.right);
        if(lst==-1||rst==-1) return -1;
        if(Math.abs(rst-lst)>1) return -1;
        return 1+Math.max(lst,rst);
    }
}
