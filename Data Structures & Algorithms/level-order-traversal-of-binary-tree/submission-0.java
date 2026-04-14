class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int n=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode t=q.remove();
                temp.add(t.val);

                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
            }
            ans.add(temp);
        }
    return ans;
    }
}
