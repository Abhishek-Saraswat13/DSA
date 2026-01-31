class Solution {
    public int trap(int[] h) {
        int n=h.length;

        int[] lmax=getlmax(h,n);
        int[] rmax=getrmax(h,n);

        int sum=0;

        for(int i=0;i<n;i++){
            int hgt=Math.min(lmax[i],rmax[i])-h[i];
            sum+=hgt;
        }
        return sum;
    }
    public int[] getlmax(int[] h,int n){
        int[] lmax=new int[n];

        lmax[0]=h[0];

        for(int i=1;i<n;i++){
            lmax[i]=Math.max(lmax[i-1],h[i]);
        }
        return lmax;
    }
    public int[] getrmax(int[] h,int n){
        int[] rmax=new int[n];

        rmax[n-1]=h[n-1];

        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(rmax[i+1],h[i]);
        }
        return rmax;
    }
}