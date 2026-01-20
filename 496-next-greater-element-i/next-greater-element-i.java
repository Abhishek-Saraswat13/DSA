class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        int idx=0;
        for(int i=0;i<nums1.length;i++){
            ans[idx++]=solve(nums1[i],nums2);
        }
        return ans;
        
        
    }
    public int solve(int num,int[] nums2){
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==num){
                for(int j=i+1;j<nums2.length;j++){
                    if(nums2[j]>num){
                        return nums2[j];
                    }
                }
            }
        }
        return -1;
    }
}