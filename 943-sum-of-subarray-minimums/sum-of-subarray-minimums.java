class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;

        int[] nsl=getnsl(arr,n);
        int[] nsr=getnsr(arr,n);

        long sum=0;
        int m=1000000007;

        for(int i=0;i<n;i++){
            long ls=i-nsl[i]; // left me kitne elments honge
            long rs=nsr[i]-i; // right me kitne elments honge

            long totalways=ls*rs; //total subarray jinka minimum arr[i] h

            long totalsum=(long)arr[i]*totalways;

            sum=(sum+totalsum)%m;
        }
        return (int)sum;
    }
    public int[] getnsl(int[] arr,int n){
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
                while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();

            st.push(i);
            }
            
        return res;
    }
    public int[] getnsr(int[] arr,int n){
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=n-1;i>=0;i--){
                while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            res[i]=st.isEmpty()?n:st.peek();

            st.push(i);
            }
            
        
        return res;
    }
}