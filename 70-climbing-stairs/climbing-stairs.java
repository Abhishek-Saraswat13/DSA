class Solution {
    int[] t=new int[46];
    public int climbStairs(int n) {
        Arrays.fill(t,-1);
        return solve(n);
        

    }
    public int solve(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        if(t[n]!=-1) return t[n];
        int step1=solve(n-1);
        int step2=solve(n-2);
        return t[n]=step1+step2;

    }
}