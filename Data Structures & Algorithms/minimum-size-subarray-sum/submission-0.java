class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int minlength=Integer.MAX_VALUE;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum=sum+nums[j];
            while(sum>=target){
            minlength=Math.min(minlength,j-i+1);
            sum-=nums[i++];
            }
        }
        return minlength==Integer.MAX_VALUE?0:minlength;
    }
}