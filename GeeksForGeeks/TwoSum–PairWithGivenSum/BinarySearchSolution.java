import java.util.Arrays;

class Solution {
    boolean twoSum(int a[], int target) {
        // code here
        
        // take O(n logn)
        Arrays.sort(a);
        
        
        // iterate :: O(n) operation
        for (int i = 0; i < a.length - 1; i++) {
            // assuming,
            // finding + a[i] = target
            int finding = target - a[i];
            
            // O(log n) operation
            int index = Arrays.binarySearch(a, i+1, a.length, finding);
            
            if (index >= 0) {
                return true;
            }
        }

        // overall Time complexity
        // O(n logn) + O(n logn)
        // = O(n logn)

        // Space complexity
        // O(1) as no aux. space consumed
        
        return false;
    }
}