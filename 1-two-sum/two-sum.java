class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int num=nums[i];
            int remain=target-num;
            if(map.containsKey(remain)){
                return new int[]{i,map.get(remain)};
            }
            map.put(num,i);
        }
        return new int[]{};
        

    }
}