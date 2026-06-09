class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(check(num)) c++;
        }
        return c;
    }
    public boolean check(int n){
        int cnt=0;
        while(n>0){
            n=n/10;
            cnt++;
        }
        if(cnt%2==0) return true;
        return false;
    }
}