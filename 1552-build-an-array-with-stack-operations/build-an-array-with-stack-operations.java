class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();
        int i = 1;
        int j = 0;
        while (j < target.length) {
            if (target[j] == i) {
                list.add("Push");
                j++;
            } else {
                list.add("Push");
                list.add("Pop");
            }
            i++;
        }
        return list;
    }
}