class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        while(j<nums.length){
        if(nums[i]==nums[j]){
            j++;
        }else{
            int res=j-i;
            if(res>(nums.length/2)){
                return nums[i];
            }
            i=j;
            j++;
        }
        }
        if (j - i > nums.length / 2) {
            return nums[i];
        }
     return nums[0];
    }
}