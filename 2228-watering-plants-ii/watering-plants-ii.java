class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int left = 0, right = plants.length - 1;
        int refillA = 0, refillB = 0;
        int currA = capacityA, currB = capacityB;

        while (left < right) {
            if (plants[left] <= currA) {
                currA -= plants[left];
            } else {
                refillA++;
                currA = capacityA - plants[left];
            }
            left++;
            if (plants[right] <= currB) {
                currB -= plants[right];
            } else {
                refillB++;
                currB = capacityB - plants[right];
            }
            right--;
        }
        if (left == right) {
            if (Math.max(currA, currB) < plants[left]) {
                if (currA >= currB) refillA++;
                else refillB++;
            }
        }
        return refillA + refillB;
    }
}