package GeeksForGeeks.UnionOfArraysWithDuplicates;

import java.util.HashSet;
import java.util.Set;

/*
    array1 : a :: all the elemnt's within b (dupB)
    array2 : b :: (dupA)
    
    len (a) + len(b) - dup(A + B) - dup (AA + BB)
    O(1)        O(1)    N*M         N*N M*M

    hashing :: set theory
    general set operations
        - *union*
        - int...
        - diff..
        ...
        
*/

class Solution {
    private static void populate(Set<Integer> set, int[] a) {
        for (int n : a) {
            set.add(n);
        }
    }
    
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        
        populate(set, a);
        populate(set, b);
        
        return set.size();
    }
}
