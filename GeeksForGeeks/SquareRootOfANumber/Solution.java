package GeeksForGeeks.SquareRootOfANumber;

class Solution {
    long floorSqrt(long n) {
        // Your code here
        // n is a natural number
        // 0 ---> N
        // srt of n would 
        // 1 ---> N
        // if n == 0 -> res == 0
        // if n != 0 -> res != 0
        if (n == 0) return 0;

        long l = 1;
        long r = n;

        while (l < r) {
            // check
            long mid = l + (r - l) / 2;
            // l and r mid == l
            // 2 and 3 mid = 2
            if (mid * mid == n || mid == l) {
                return mid;
            }

            if (mid * mid > n) {
                // result is in the left
                r = mid;
            } else {
                l = mid;
            }
        }

        return l;
    }
}