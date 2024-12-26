   
/*
    1   5   9
    14  20  21 // target mid = 1 // 0 + (2 - 0)/2
    30  34  43
    
    x : 34
*/


class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] a, int x) {
        // code here
        // apply bin search upon row and col.
        // O(log n * log m)
        
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            int[] targetRow = a[mid];
            
            // if x is in target
            if (targetRow[0] <= x && x <= targetRow[targetRow.length-1]) {
                return Arrays.binarySearch(targetRow, x) >= 0;
            }

            // or not
            if (x < targetRow[0]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        
        return false;
    }
}
