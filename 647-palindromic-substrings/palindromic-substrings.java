class Solution {
    int[][] t=new int[1001][1001];
    public int countSubstrings(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            Arrays.fill(t[i],-1);
        }

        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    c++;
                }
            }
        }                          
        return c;
    }
    public boolean isPalindrome(String s,int i,int j){
       if(i>j) return true;
       if(t[i][j]!=-1) return t[i][j]==1;
       if(s.charAt(i)==s.charAt(j)){
        boolean res=isPalindrome(s,i+1,j-1);
        t[i][j]=res?1:0;
        return res;
       }
       t[i][j]=0;
       return false;
    }
}