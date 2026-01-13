class Solution {
    int[][] t=new int[1001][1001];
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            Arrays.fill(t[i],-1);
        }
        return solve(s,0,n-1);
    }
    public int solve(String s,int i,int j){
        if(i>j){
            return 0;
        }
        if(i==j) return 1;
        if(t[i][j]!=-1) return t[i][j];

        else if(s.charAt(i)==s.charAt(j)){
            return t[i][j]=2+solve(s,i+1,j-1);
        }
        else{
            return t[i][j]=Math.max(solve(s,i,j-1),solve(s,i+1,j));
        }
    }
}