class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;

        if(n==0 || n==1) return 0;

        int[] t=new int[n];

        t[0]=0;
        t[1]=Math.max(prices[1]-prices[0],0);

        for(int i=2;i<n;i++){
            t[i]=t[i-1];
            for(int j=0;j<=i-1;j++){
                int today_profit=prices[i]-prices[j];

                int prev_profit=j>=2?t[j-2]:0;

                t[i]=Math.max(t[i],today_profit+prev_profit);
            }
        }
        return t[n-1];

    }
}