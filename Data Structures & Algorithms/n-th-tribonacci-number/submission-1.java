class Solution {
    public int tribonacci(int n) {

        if(n==0) return 0;
        
        int[] dp=new int[3];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        
        for(int i=3;i<=n;i++){
            int curr=dp[0]+dp[1]+dp[2];
            dp[0]=dp[1];
            dp[1]=dp[2];
            dp[2]=curr;
        }
        return dp[2];
    }
}