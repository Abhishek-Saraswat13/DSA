class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int max=0;
        int min=p[0];

        for(int i=0;i<n;i++){
            int profit=p[i]-min;
            max=Math.max(max,profit);  
            min=Math.min(min,p[i]);  
        }
        
        return max;
    }
}