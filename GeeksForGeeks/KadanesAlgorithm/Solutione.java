package GeeksForGeeks.KadanesAlgorithm;

// User function Template for Java
class Solution {
    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] a) {
        // Your code here
        // start and end
        // O(n*n)

        // track of max sum
        // start -> 0,n 

        /*
        [1, 2, 3, -2, -3,   10000]
         *  3  6   4   1,  10001(cur_sum)  
         // max sum
         // cur sum
        */

        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Null or empty Array");
        }

        int max_sum = a[0];
        int cur_sum = 0;

        for (int i = 0; i < a.length; i++) {
            cur_sum += a[i];

            max_sum = Math.max(max_sum, cur_sum);

            if (cur_sum < 0) {
                cur_sum = 0;
            }
        }

        return max_sum;
    }
}
