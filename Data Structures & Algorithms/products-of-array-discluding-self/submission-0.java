class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int premul=1;
        int postmul=1;
        // 1 2 3 4
        for(int i=0;i<n;i++){
        res[i]=premul;
        premul*=nums[i];
        // 1 1 2 6
        }
        //24 12 8 6
        for(int i=n-1;i>=0;i--){
        res[i]*=postmul;
        postmul*=nums[i];
        }
        return res;
    }
}  
