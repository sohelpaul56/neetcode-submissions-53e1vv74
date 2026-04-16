class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int min=100000;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]>=nums[i]){
            min=Math.min(min,nums[i]);
            i=mid+1;
            }
            else{
                min=Math.min(min,nums[mid]);
                j=mid-1;
            }
        }
        return min;
    }
}
