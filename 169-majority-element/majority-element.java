class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int e=0;
        for(int num:nums){
            if(c==0){
                c=1;
                e=num;
            }
            else if(num==e){
                c++;
            }
            else{
                c--;
            }
        }
        return e;
    }
}