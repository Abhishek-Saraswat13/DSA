class Solution {
    public boolean isPowerOfTwo(int num) {
        double n=num;

        while(n>1){
            n=n/2;
        }
        if(n==1.0) return true;

        return false;
    }
}