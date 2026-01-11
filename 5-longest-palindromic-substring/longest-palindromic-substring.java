class Solution {
    int[][] t=new int[1001][1001];
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxlen=0;
        int sp=0;
        for(int i=0;i<n;i++){
            Arrays.fill(t[i],-1);
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(solve(s,i,j)){
                    if(j-i+1>maxlen){
                        maxlen=j-i+1;
                        sp=i;
                    }
                }
            }
        }
        return s.substring(sp,sp+maxlen);
    }
        public boolean solve(String s,int i,int j){
            if(i>=j){
                return true;
            }
            if(t[i][j]!=-1) return t[i][j]==1;
            if(s.charAt(i)==s.charAt(j)){
                boolean res=solve(s,i+1,j-1);
                t[i][j]=res?1:0;
                return res;
            }
            t[i][j]=0;
            return false;
        }
    
    
}