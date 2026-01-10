class Solution {
    int m,n;
    int[][] dp=new int[501][501];
    public int minDistance(String s1, String s2) {
        m=s1.length();
        n=s2.length();
        for(int i=0;i<=m;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(s1,s2,m,n);
    }
    public int solve(String s1,String s2,int m,int n){
        if(m==0 || n==0) return m+n;
        
        if(dp[m][n]!=-1) return dp[m][n];
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            dp[m][n]=solve(s1,s2,m-1,n-1);
        }
        else{
            int insert=1+solve(s1,s2,m,n-1);
            int delete=1+solve(s1,s2,m-1,n);
            int replace=1+solve(s1,s2,m-1,n-1);

            return dp[m][n]=Math.min(Math.min(insert,delete),replace);
        }
        return dp[m][n];
    }
}