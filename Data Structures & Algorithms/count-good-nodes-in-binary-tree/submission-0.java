class Solution {
    public int goodNodes(TreeNode root) {
        return helper(root,root.val);
    }
    private int helper(TreeNode node,int max){
        int count=0;
        if(node==null) return 0;
        if(node.val>=max) count=1;
        max = Math.max(max, node.val);

        count += helper(node.left, max);
        count += helper(node.right, max);
        return count;
    }
}
