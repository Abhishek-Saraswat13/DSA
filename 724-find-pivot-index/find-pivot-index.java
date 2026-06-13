class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int lsum=lsolve(nums,i);
            int rsum=rsolve(nums,i+1);
            if(lsum==rsum) return i;
        }
        return -1;
        
    }
    public int lsolve(int[] nums,int idx){
        if(idx==0) return 0;
        int sum=0;
        for(int i=0;i<idx;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public int rsolve(int[] nums,int idx){
        if(idx==0) return -1;
        int sum=0;
        for(int i=idx;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}