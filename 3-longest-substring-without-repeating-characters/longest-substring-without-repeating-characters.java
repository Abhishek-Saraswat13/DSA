class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashSet<Character> set=new HashSet<>();
    int max=0;
     int i=0;
     int j=0;
     while(j<s.length()){
        if(!set.contains(s.charAt(j))){
            set.add(s.charAt(j));
            max=Math.max(max,set.size());
            j++;
        }
        else{
            set.remove(s.charAt(i));
            i++;
        }
     }   
     return max;
    }
}