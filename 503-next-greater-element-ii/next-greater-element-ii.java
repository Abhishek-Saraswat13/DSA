class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            ans[idx++]=solve(nums[i],nums,i);
        }
        return ans;
        
    }
    public int solve(int num,int[] nums,int idx){
            for(int i=idx+1;i<nums.length;i++){
            if(nums[i]>num){
                return nums[i];
                }
            }

            for(int i=0;i<idx;i++){
                if(nums[i]>num){
                    return nums[i];
            }
            }
        

        return -1;
    }
}