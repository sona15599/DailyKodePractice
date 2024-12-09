package GeeksForGeeks.FindHIndex.java_solution.learn.findhindex;

import java.util.Arrays;

class Solution {
    // Function to find hIndex
    public int hIndex(int[] a) {
        // code here
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (i+1 > a[a.length - i - 1]) {
                return i;
            }
        }
        return a.length;
    }
}