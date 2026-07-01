class Solution {

    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0)
            return res;

        Map<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        solve(0, digits, "", map);

        return res;
    }

    public void solve(int idx, String d, String temp,
                      Map<Character, String> map) {

        if (idx == d.length()) {
            res.add(temp);
            return;
        }

        String s = map.get(d.charAt(idx));

        for (int i = 0; i < s.length(); i++) {
            solve(idx + 1, d, temp + s.charAt(i), map);
        }
    }
}