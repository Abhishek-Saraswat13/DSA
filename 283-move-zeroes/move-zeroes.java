class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        for(int i=k;i<n;i++){
            nums[k]=0;
            k++;
        }
    }
}