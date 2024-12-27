import java.util.*;

/*
    mapping 
    
    count => 1 + 1 + 1 -> 3
    arr[] = [1, 5, 7, -1, 5], target = 6 
    
    map ::
    value -> count
    1 -> 1
    5 -> 2
    7 -> 1
    -1 -> 1
    
*/
class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        final Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for (int i : arr) {
            // finding + i = target
            int finding = target - i;
            
            if (map.containsKey(finding)) {
                // we got a pair
                count += map.get(finding);
            }
            
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        return count;
    }
}


