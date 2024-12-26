// User function Template for Java

/*
way 1 :
    brute-force
        TC: O(n*n)
        SC: O(1)
        
    binary search
        // 1, 4, 45, 6, 10, 8
        // 1, 4, 6, 8, 10, 45 :sorted:
        // itr: 0 -> n-1 
        // for each I'll binary search upon the array 
        TC: O(nlogn)
        SC: O(1)
        
    set
        // find target :: 16
        // current value = 10
        // check within set if there exist 6 or not
        TC: O(n)
        SC: O(n)
        
    HashSet
        // value -> List<index>

*/

import java.util.HashSet;
import java.util.Set;

class Solution {
    boolean twoSum(int arr[], int target) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            // existElement + i = target
            int existElement = target - i;

            if (set.contains(existElement)) {
                return true;
            }

            set.add(i);
        }

        return false;
    }
}

