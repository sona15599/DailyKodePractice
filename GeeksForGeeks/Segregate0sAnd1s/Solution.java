class Solution {
    void segregate0and1(int[] a) {
        // code here

        // 2. counters 0's and 1's O(n) O(1)
        // counterBasedImplementation(a);
        // countOne = a.length - countZero

        // 3. inplace by swapping
        inplace(a);
    }

    void inplace(int[] a) {
        // zero first
        // one last
        int zeroItr = 0;
        int oneItr = a.length - 1;

        int i = 0;
        while (i < oneItr) {
            if (a[i] == 0) {
                // it's time to insert the 
                // number into zeroth position
                a[zeroItr] = 0;
                zeroItr++;
                i++;
            } else {
                // found 1
                int value = a[oneItr];
                a[oneItr] = 1;
                a[i] = value;

                oneItr--;
            }
        }
    }

    void counterBasedImplementation(int[] a) {
        int countZero = 0;

        // counting
        for (int i = 0; i < a.length; i++) {
            countZero += a[i] == 0? 1 : 0;
        }

        // setting loop
        int i = 0;
        while (countZero > 0) {
            a[i++] = 0;
            countZero--;
        }

        while (i < a.length) {
            a[i++] = 1;
        }
    }
}
