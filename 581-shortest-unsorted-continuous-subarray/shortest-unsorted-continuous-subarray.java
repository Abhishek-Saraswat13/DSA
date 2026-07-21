class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);

        int i = 0;
        int j = nums.length - 1;

        while (i < nums.length && nums[i] == temp[i]) {
            i++;
        }

        while (j > i && nums[j] == temp[j]) {
            j--;
        }

        if (i == nums.length) {
            return 0;
        }

        return j - i + 1;
    }
}