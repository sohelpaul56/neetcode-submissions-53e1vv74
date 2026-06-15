class Solution {
    public int maxProfit(int[] prices) {
        int curr_priz=prices[0];
        int max_priz=0;
        int bal=0;
        for(int i=1;i<prices.length;i++){
            bal=prices[i]-curr_priz;
            max_priz=Math.max(max_priz,bal);
            curr_priz=Math.min(curr_priz,prices[i]);
        }
        return max_priz;
    }
}
