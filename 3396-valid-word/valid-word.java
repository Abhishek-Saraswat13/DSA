class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        int vc = 0;
        int cc = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'A' ||
                    ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U') {
                    vc++;
                } else {
                    cc++;
                }
            } else if (Character.isDigit(ch)) {
            } else {
                return false;
            }
        }

        return vc > 0 && cc > 0;
    }
}