class Solution {

    public int numMatchingSubseq(String s, String[] words) {

        List<Integer>[] pos = new ArrayList[26];

        for (int i = 0; i < 26; i++) {
            pos[i] = new ArrayList<>();
        }

        // Store indices of each character
        for (int i = 0; i < s.length(); i++) {
            pos[s.charAt(i) - 'a'].add(i);
        }

        int count = 0;

        for (String word : words) {
            if (isSubsequence(word, pos)) {
                count++;
            }
        }

        return count;
    }

    private boolean isSubsequence(String word, List<Integer>[] pos) {

        int prev = -1;

        for (char ch : word.toCharArray()) {

            List<Integer> list = pos[ch - 'a'];

            if (list.isEmpty())
                return false;

            int index = upperBound(list, prev);

            if (index == list.size())
                return false;

            prev = list.get(index);
        }

        return true;
    }

    private int upperBound(List<Integer> list, int target) {

        int low = 0;
        int high = list.size();

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (list.get(mid) <= target)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }
}