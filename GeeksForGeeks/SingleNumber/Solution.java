package GeeksForGeeks.SingleNumber;

class Solution {
    int getSingle(int a[]) {
        // code here
        int x = 0;
        for (int i : a) {
            x ^= i;
        }
        return x;
    }
}