class Solution {
    public void swap(char[] arr,int i,int j){
        while(i<j){
            char ch=arr[i];
            arr[i]=arr[j];
            arr[j]=ch;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int i=0;
        int n=arr.length;

        while(i<n){
            int j=Math.min(i+k-1,n-1);
            swap(arr,i,j);
            i=i+2*k;
        }

        return new String(arr);

        
        
    }
}