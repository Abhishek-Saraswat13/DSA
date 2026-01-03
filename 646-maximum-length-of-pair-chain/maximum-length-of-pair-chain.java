class Solution {
    int n;
    int[][] dp=new int[1001][1001];
    public int findLongestChain(int[][] nums) {
        Arrays.sort(nums, (a, b) -> a[1] - b[1]);
        n=nums.length;
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(nums,0,-1);
    }
    public int solve(int[][] nums,int i,int p){
        if(i>=n) return 0;

        if(p!= -1 && dp[i][p]!=-1) return dp[i][p];

        int take=0;
        if(p==-1 || nums[i][0]>nums[p][1]){
            take=1+solve(nums,i+1,i);
        }
        int skip=solve(nums,i+1,p);

        if(p!=-1){
            dp[i][p]=Math.max(take,skip);
        }

        return Math.max(take,skip);
    }
}