class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> used = new HashSet<>();
        String[] arr=s.split(" ");

        if(pattern.length() != arr.length) return false; 
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = arr[i];

            if(map.containsKey(ch) && !map.get(ch).equals(word)){
                return false;
            }
            if(!map.containsKey(ch) && used.contains(word)){
                return false;
            }
            map.put(ch,word);
            used.add(word);
        }
        return true;
        
    }
}