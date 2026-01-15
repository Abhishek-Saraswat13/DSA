class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num=Math.abs(nums[i]);
            nums[i]=num*num;
        }
        Arrays.sort(nums);
        return nums;
    }
}