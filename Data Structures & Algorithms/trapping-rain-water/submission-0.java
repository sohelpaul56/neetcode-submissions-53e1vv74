class Solution {
    public int trap(int[] heights) {
       int ans=0;
       int n=heights.length;
       int leftmax=0; 
       int rightmax=0; 
       int l=0;
       int r=n-1;
       while(l<=r){
       leftmax=Math.max(leftmax,heights[l]);
       rightmax=Math.max(rightmax,heights[r]);
       if(leftmax<rightmax)
       ans+=leftmax-heights[l++];
       else
       ans+=rightmax-heights[r--];
       }
       return ans;
    }
}