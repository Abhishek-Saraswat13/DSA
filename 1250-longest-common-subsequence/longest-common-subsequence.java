class Solution {
    int m;
    int n;
    int[][] dp=new int[1001][1001];
    public int longestCommonSubsequence(String s1, String s2) {
        m=s1.length();
        n=s2.length();
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        
        return solve(s1,s2,0,0);
    }
    public int solve(String s1,String s2,int i,int j){
        if(i>=m || j>=n) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+solve(s1,s2,i+1,j+1);
        }
        return dp[i][j]=Math.max(solve(s1,s2,i+1,j),solve(s1,s2,i,j+1));
    } 
}