class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int c=0;
        int max=0;
        while(i<nums.length){
            if(nums[i]==1){
                c++;
                i++;
            }
            else{
                max=Math.max(max,c);
                c=0;
                i++;
            }
        }
        max=Math.max(max,c);

        return max;
    }
}