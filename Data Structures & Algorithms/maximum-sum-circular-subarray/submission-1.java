class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum=0;
        int currmax=0;
        int maxsum=nums[0];
        int currmin=0;
        int minsum=nums[0];
        for(int num:nums){
            currmax=Math.max(num,num+currmax);
            maxsum=Math.max(maxsum,currmax);

            currmin=Math.min(num,num+currmin);
            minsum=Math.min(minsum,currmin);

            totalsum+=num;
        }
        if(maxsum<0) return maxsum;
        return Math.max(maxsum,totalsum-minsum);
    }
}