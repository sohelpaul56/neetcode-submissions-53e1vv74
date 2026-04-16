class Solution {
    int preindex=0;
    HashMap<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    map=new HashMap<>();
    for(int i=0;i<inorder.length;i++){
        map.put(inorder[i],i);
    }
    return helper(preorder,inorder,0,inorder.length-1);
    }
    private TreeNode helper(int[] preorder, int[] inorder,int left,int right){
        if(left>right) return null;
        int rootval=preorder[preindex++];
        TreeNode root=new TreeNode(rootval);
        int index=map.get(rootval);
        root.left=helper(preorder,inorder,left,index-1);
        root.right=helper(preorder,inorder,index+1,right);
        return root;
    }
}