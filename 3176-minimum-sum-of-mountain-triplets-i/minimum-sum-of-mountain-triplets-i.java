class Solution {
    public int minimumSum(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]<nums[j] && nums[k]<nums[j]){
                        min=Math.min(min,nums[i]+nums[j]+nums[k]);
                    }
                }
            }
        }
        if(min==2147483647) return -1;
        return min;
    }
}