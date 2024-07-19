package GeeksForGeeks.LongestAlternatingSubsequence;

class Solution {
    public int alternatingMaxLength(int[] a) {
        // code here

        if (a.length < 1) {
            return a.length;
        }

        int high = 1;
        int low = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i-1]) {
                // it got high
                high = low + 1;
            } else if (a[i] < a[i-1]) {
                // got low
                low = high + 1;
            }
        }

        return Math.max(high, low);
    }
}

