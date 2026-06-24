class Solution {
    public boolean digitCount(String num) {
        java.util.Map<Integer, Integer> mp = new java.util.HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            int d = num.charAt(i) - '0';
            mp.put(d, mp.getOrDefault(d, 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            int expected = num.charAt(i) - '0';
            if (mp.getOrDefault(i, 0) != expected) return false;
        }
        return true;
    }
}