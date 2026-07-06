class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;

        for(int n:nums){
            int lds=0;
            while(n>0){
                lds+=n%10;
                n=n/10;
            }
            if(lds<min){
                min=lds;
            }
        }
        return min;
    }
}