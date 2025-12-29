class Solution {
    int[] dp=new int[101]; 
    public int rob(int[] nums) {
        int n=nums.length;
        Arrays.fill(dp,-1);
        return solve(0,nums,n);
    }
    public int solve(int i,int[] nums,int n){
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int steal=nums[i]+solve(i+2,nums,n);
        int skip=solve(i+1,nums,n);

        return dp[i]=Math.max(steal,skip);
    }
}