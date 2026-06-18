class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=jewels.length()-1;
        int m=stones.length()-1;
        int i=0;
        int j=0;
        int c=0;
        while(i<=n){
            char ch=jewels.charAt(i);
            j=0;
            while(j<=m){
                if(ch==stones.charAt(j)){
                c++;
                }
            j++;
            }
            i++;
        }
        return c;
    }
}