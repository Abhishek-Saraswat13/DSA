class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int len = digits.length;
        Stack<Integer> stack = new Stack<>();

        // Step 1: Find the first decreasing element from the right
        int i = len - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        
        if (i == -1) return -1; // No next greater permutation
        
        // Step 2: Find the smallest number greater than digits[i] to the right
        int j = len - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Step 3: Swap elements at i and j
        swap(digits, i, j);

        // Step 4: Reverse the suffix (digits after index i)
        reverse(digits, i + 1, len - 1);

        // Convert back to integer
        long result = Long.parseLong(new String(digits));

        // Step 5: Check 32-bit integer limit
        return (result > Integer.MAX_VALUE) ? -1 : (int) result;
    }

    // Utility function to swap two characters in an array
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Utility function to reverse a portion of an array
    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}