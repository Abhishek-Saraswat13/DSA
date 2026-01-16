class Solution {
    int[][] dp;
    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp=new int[n][2];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,1,prices);
    }
    public int solve(int i,int buy,int[] prices){
        if(i==prices.length){
            return 0;
        }
        if(dp[i][buy]!=-1) return dp[i][buy];
        int profit=0;

        if(buy==1){
            int buykaro=-prices[i]+solve(i+1,0,prices);
            int skip=0+solve(i+1,1,prices);
            profit=Math.max(skip,buykaro);
        }
        else{
            int sell=prices[i]+solve(i+1,1,prices);
            int skip=0+solve(i+1,0,prices);
            profit=Math.max(sell,skip);
        }
        return dp[i][buy]=profit;
    }
}