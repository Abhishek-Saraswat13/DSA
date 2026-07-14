class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entry = new ArrayList<>(map.entrySet());

        entry.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = entry.get(i).getKey();
        }

        return ans;
    }
}