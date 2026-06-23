class Solution {
    public int totalFruit(int[] f) {
       Map<Integer, Integer> map = new HashMap<>();

        int i = 0;
        int ans = 0;

        for (int j = 0; j < f.length; j++) {

            map.put(f[j], map.getOrDefault(f[j], 0) + 1);

            while (map.size() > 2) {
                map.put(f[i], map.get(f[i]) - 1);

                if (map.get(f[i]) == 0) {
                    map.remove(f[i]);
                }

                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        return ans;

       
           
    }
}