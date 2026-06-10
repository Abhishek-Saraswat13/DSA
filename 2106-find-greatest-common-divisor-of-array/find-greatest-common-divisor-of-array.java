class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=nums[0];
        return gcd(max,min);
    }
    public int gcd(int a,int b){
        int min=Math.min(a,b);

        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }

        }
        return 1;
        
    }
}