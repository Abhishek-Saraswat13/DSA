class Solution {
    public List<String> removeAnagrams(String[] words) {
        Stack<String> st = new Stack<>();

        for (String word : words) {

            if (st.isEmpty()) {
                st.push(word);
                continue;
            }

            char[] arr1 = st.peek().toCharArray();
            char[] arr2 = word.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (!Arrays.equals(arr1, arr2)) {
                st.push(word);
            }
        }

        return new ArrayList<>(st);
    }
}