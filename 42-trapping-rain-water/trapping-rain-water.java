class Solution {
    public int trap(int[] h) {
        // int ans=0;
        // Stack<Integer> s=new Stack<>();
        // int lm=-1;
        // int rm=-1;
        // int curr=-1;

        // for(int i=0;i<h.length;i++){
        //     while(!s.isEmpty() && h[i]>h[s.peek()]){
        //         rm=i;
        //         curr=s.pop();
        //         if(s.isEmpty()){
        //             break;
        //         }
        //         lm=s.peek();
        //         int width=rm-lm-1;
        //         ans+=(Math.min(h[lm],h[rm])-h[curr])*width;
        //     }
        //     s.push(i);
        // }
        // return ans;

        int n=h.length;
        int ans=0;
        int l=0,r=n-1;
        int lmax=0,rmax=0;

        while(l<r){
            lmax=Math.max(lmax,h[l]);
            rmax=Math.max(rmax,h[r]);

            if(lmax<rmax){
                ans+=lmax-h[l];
                l++;
            }
            else{
                ans+=rmax-h[r];
                r--;
            }
        }
        return ans;

    }
}