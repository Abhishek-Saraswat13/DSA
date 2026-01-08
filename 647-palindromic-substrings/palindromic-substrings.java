class Solution {
    public int countSubstrings(String s) {
        int c=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s.substring(i,j+1))){
                    c++;
                }
            }
        }
        return c;
    }
    public boolean isPalindrome(String s){
        int n=s.length();
        if(n==1) return true;
        int i=0;
        int j=n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}