class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            int num=2*arr[i];
            if (num == 0) {
                if (map.get(0) > 1) return true;
            }
            else{
                if(map.containsKey(num)) return true;
        }
        }
        return false;
    }
}