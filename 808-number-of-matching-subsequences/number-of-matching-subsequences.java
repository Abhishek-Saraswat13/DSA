class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int c=0;
        Map<String,Integer> map=new HashMap<>();

        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String key=entry.getKey();
            if(solve(key,s)){
                c+=entry.getValue();
            }
        }
        return c;
        
    }
    public boolean solve(String word,String s){
        int i = 0, j = 0;

        while (i < word.length() && j < s.length()) {
            if (word.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return i==word.length();
    }
}