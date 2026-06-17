class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return nums;
    }

    public static void divide(int[] nums, int l, int r) {
        if (l >= r) return;

        int mid = l + (r - l) / 2;

        divide(nums, l, mid);
        divide(nums, mid + 1, r);

        merge(nums, l, mid, r);
    }

    public static void merge(int[] nums, int l, int mid, int r) {
        int[] arr = new int[r - l + 1];

        int idx1 = l;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= r) {
            if (nums[idx1] <= nums[idx2]) {
                arr[x++] = nums[idx1++];
            } else {
                arr[x++] = nums[idx2++];
            }
        }

        while (idx1 <= mid) {
            arr[x++] = nums[idx1++];
        }

        while (idx2 <= r) {
            arr[x++] = nums[idx2++];
        }

        for (int i = 0; i < arr.length; i++) {
            nums[l + i] = arr[i];
        }
    }
}