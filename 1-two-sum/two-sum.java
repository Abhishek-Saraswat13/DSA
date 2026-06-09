class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int n=nums.length;
        for(int i=0; i<n-1; i++){
            int tar=target;
            tar=tar-nums[i];
            arr[0]=i;
            for(int j=i+1; j<n; j++){
                if(tar==nums[j]){
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;

    }
}