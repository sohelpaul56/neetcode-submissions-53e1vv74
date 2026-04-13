class Solution {
    public int maxArea(int[] heights) {
       int ans=0;
       int n=heights.length;
       int l=0;
       int r=n-1;
       while(l<=r){
       int width=Math.abs(r-l); 
       int height=Math.min(heights[l],heights[r]); 
       ans=Math.max(ans,(width*height));
       if(heights[l]<heights[r]) l++;
       else r--;
       }
       return ans;
    }
}
