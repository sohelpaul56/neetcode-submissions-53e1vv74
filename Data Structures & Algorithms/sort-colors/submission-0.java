class Solution {
    public void sort(int[] nums,int s,int e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }
    public void sortColors(int[] nums) {
        int i=0,start=0;
        int end=nums.length-1;
        while(i<=end){
        if(nums[i]==0){
            sort(nums,i,start);
            i++;
            start++;
        }else if(nums[i]==2){
        sort(nums,i,end);
        end--;
        }
        else i++;
    }
}
}