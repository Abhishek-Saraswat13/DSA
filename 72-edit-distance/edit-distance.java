class Solution {
    int m,n;
    int[][] dp=new int[501][501];
    public int minDistance(String s1, String s2) {
        m=s1.length();
        n=s2.length();
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(s1,s2,0,0);
    }
    public int solve(String s1,String s2,int i,int j){
        if(i>=m){
            return n-j;
        }
        if(j>=n){
            return m-i;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]=solve(s1,s2,i+1,j+1);
        }
        else{
            int insert=1+solve(s1,s2,i,j+1);
            int delete=1+solve(s1,s2,i+1,j);
            int replace=1+solve(s1,s2,i+1,j+1);

            return dp[i][j]=Math.min(Math.min(insert,delete),replace);
        }
        return dp[i][j];
    }
}