package java_solution.learn.sortcolors;

import java.util.Arrays;

public class Approach1 {
    public void sortColors(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        Arrays.sort(a);
    }
}
