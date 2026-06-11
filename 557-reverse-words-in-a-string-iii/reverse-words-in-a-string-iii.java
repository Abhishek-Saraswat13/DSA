class Solution {

    public String reverse(String str) {
        char[] ch = str.toCharArray();

        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }

        return new String(ch);
    }

    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverse(arr[i]);
        }

        return String.join(" ", arr);
    }
}