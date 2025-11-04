class Solution {
    public void reverseString(char[] s) {
        func(s,0,s.length-1);
    }
    public void func(char[] s,int st,int end){
        if(st>=end){
            return;
        }
        char temp=s[st];
        s[st]=s[end];
        s[end]=temp;

        func(s,st+1,end-1);

    }
}