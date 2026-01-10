class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxi=0;
        int[] a=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    if(j-i>maxi){
                        maxi=j-i;
                        a[0]=i;
                        a[1]=j;
                    }
                }
            }
        }
        return s.substring(a[0],a[1]+1);
        
    }
    public boolean isPalindrome(String s,int i,int j){
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