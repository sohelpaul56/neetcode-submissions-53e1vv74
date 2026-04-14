class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode t=q.remove();
                if(i==n-1)
                ans.add(t.val);

                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
            }
        }
        return ans;
    }
}
