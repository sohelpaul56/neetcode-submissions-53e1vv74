class Solution {
     public int hammingWeight(int n) {
        int count = 0;
        
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        
        return count;
    }
    public int[] countBits(int m) {
        int[] ans=new int[m+1];
        for(int i=1;i<=m;i++){
            ans[i]=hammingWeight(i);
        }
        return ans;
    }
}
