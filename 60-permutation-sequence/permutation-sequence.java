class Solution {
    String ans = "";
    int cnt = 0;

    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        boolean[] freq = new boolean[n];
        List<Integer> list = new ArrayList<>();

        func(nums, list, k, freq);
        return ans;
    }

    public void func(int[] nums, List<Integer> list, int k, boolean[] freq) {
        if (!ans.equals("")) return;

        if (list.size() == nums.length) {
            cnt++;
            if (cnt == k) {
                StringBuilder sb = new StringBuilder();
                for (int num : list) sb.append(num);
                ans = sb.toString();
            }
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                list.add(nums[i]);

                func(nums, list, k, freq); 

                list.remove(list.size() - 1);
                freq[i] = false;
            }
        }
    }
}
