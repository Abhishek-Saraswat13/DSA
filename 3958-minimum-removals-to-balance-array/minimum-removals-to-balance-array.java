class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int max=1;

        while(j<n){
            while((long)nums[j]>(long)k*nums[i]){
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return n-max;
        
    }
}