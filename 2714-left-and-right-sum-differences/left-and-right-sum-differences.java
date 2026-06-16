class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ts=0;
        for(int num:nums){
            ts+=num;
        }
        int ls=0;
        int[] res=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int rs=ts-ls-nums[i];
            res[i]=Math.abs(ls-rs);
            ls+=nums[i];
        }
        return res;
    }
}