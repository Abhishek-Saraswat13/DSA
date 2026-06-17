class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int[] arr:nums){
            for(int num:arr){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();

        for(int key:map.keySet()){
            if(map.get(key)==nums.length){
                list.add(key);
            }
        }
        Collections.sort(list);
        return list;
    }
}