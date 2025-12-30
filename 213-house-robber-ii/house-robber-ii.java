class Solution {
    int[] dp=new int[101];
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        Arrays.fill(dp,-1);

        int take_0th_house=func(0,nums,n-2);

        Arrays.fill(dp,-1);
        int take_1th_house=func(1,nums,n-1);

        return Math.max(take_0th_house,take_1th_house);
    }
    public int func(int i,int[] nums,int n){
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
       
        int steal=nums[i]+func(i+2,nums,n);
        int skip=func(i+1,nums,n);

        return dp[i]=Math.max(steal,skip);
    }
}