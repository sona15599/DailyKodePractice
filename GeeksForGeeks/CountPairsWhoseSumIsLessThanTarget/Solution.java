import java.util.Arrays;

class Solution {
    int countPairs(int a[], int target) {
        Arrays.sort(a);

        int count = 0;
        int l = 0;
        int r = a.length - 1;

        while (l < r) {
            int sum = a[l] + a[r];

            if (sum >= target) {
                r--;
            } else {
                count += r - l;
                l++;
            }
        }

        return count;
    }
}