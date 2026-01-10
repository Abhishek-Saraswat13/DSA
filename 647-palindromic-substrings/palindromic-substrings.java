class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] t = new boolean[n][n];
        int c = 0;

        for (int l = 1; l <= n; l++) {
            for (int i = 0; i + l - 1 < n; i++) {
                int j = i + l - 1;

                if (i == j) {
                    t[i][j] = true; // single char
                } else if (i + 1 == j) {
                    t[i][j] = (s.charAt(i) == s.charAt(j)); // length 2
                } else {
                    t[i][j] = (s.charAt(i) == s.charAt(j) && t[i + 1][j - 1]);
                }

                if (t[i][j]) c++;
            }
        }
        return c;
    }
}
