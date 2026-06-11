class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String f=strs[0];
        String l=strs[strs.length-1];
        int c=0;
        int len=f.length()>l.length()?l.length():f.length();
        for(int i=0;i<len;i++){
            if(f.charAt(i)==l.charAt(i)){
                c++;
            }
            else break;
        }
        if(c==0) return "";
        return f.substring(0,c);
    }
}