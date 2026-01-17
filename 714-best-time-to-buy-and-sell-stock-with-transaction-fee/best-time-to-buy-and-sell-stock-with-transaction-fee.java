class Solution {
    int[][] dp;
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        dp=new int[n][2];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,1,prices,fee);
    }
    public int solve(int i,int buy,int[] prices ,int fee){
        if(i>=prices.length) return 0;
        int profit=0;

        if(dp[i][buy]!=-1) return dp[i][buy];

        if(buy==1){
            int buy_karo=-prices[i]+solve(i+1,0,prices,fee);
            int skip_karo=solve(i+1,1,prices,fee);
            profit=Math.max(buy_karo,skip_karo);
        }
        else{
            int sell_karo=prices[i]-fee+solve(i+1,1,prices,fee);
            int skip_karo=solve(i+1,0,prices,fee);
            profit=Math.max(sell_karo,skip_karo);
        }
        return dp[i][buy]=profit;
    }
}