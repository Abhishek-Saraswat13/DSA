class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        String s=Integer.toString(x);
        StringBuilder sb=new StringBuilder(s);
        StringBuilder sb1=new StringBuilder(s);
        sb1.reverse();

        return sb.toString().equals(sb1.toString());
    }
}