class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=nums.length-1;

        if(n==0) return 0;
        if(n==2){
            return nums[0]<nums[1]?1:0;
        }

        while(l<r){
            int mid=l+(r-l)/2;

            if(nums[mid]<nums[mid+1]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
}