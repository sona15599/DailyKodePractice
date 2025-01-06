package GeeksForGeeks.SumPairClosestToTarget;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class provides a solution for the problem of finding a pair of elements in an array 
 * that sum up to a value closest to the target.
 */
class Solution {
    /**
     * Finds a pair of elements in the array that sum up to a value closest to the target.
     * 
     * @param a   the array of elements
     * @param target   the target value
     * @return  a list containing the two elements whose sum is closest to the target
     */
    public ArrayList<Integer> sumClosest(int[] a, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        // check insufficient length
        if (a.length < 2) return result;

        Arrays.sort(a);

        int left = 0;
        int right = a.length - 1;

        int closestDiff = Integer.MAX_VALUE;

        while (left < right) {
            int curSum = a[left] + a[right];
            int curDiff = Math.abs(curSum - target);

            if (curDiff < closestDiff) {
                closestDiff = curDiff;
                result.clear();
                result.add(a[left]);
                result.add(a[right]);
            }

            if (curSum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
