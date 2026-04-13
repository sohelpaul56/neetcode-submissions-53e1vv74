class Solution {
    public long minEnd(int n, int x) {
        int[] arr=new int[n];
        long ans=x;
        n=n-1;
        while(n-->0){
        ans=x|(ans+1);
        }
        return ans;
    }
}