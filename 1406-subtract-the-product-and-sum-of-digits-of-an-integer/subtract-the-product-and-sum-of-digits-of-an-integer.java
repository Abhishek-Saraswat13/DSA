class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int sum=0;

        int temp=n;

        while(temp>0){
            int r=temp%10;
            sum=sum+r;
            p=p*r;
            temp=temp/10;
        }
        return p-sum;
    }
}