class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int x=j+1;
                int y=nums.length-1;
                while(x<y){
                long sum=(long)nums[i]+nums[j]+nums[x]+nums[y];
                if(sum==target){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[x],nums[y]));
                    x++;
                    y--;
                }else if(sum<target){
                    x++;
                }else{
                    y--;
                }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}