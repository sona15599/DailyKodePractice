package java_solution.learn.validanagram;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // neither of letter is used more
        // neither of letter is used less
        if (s.length() != t.length()) {
            return false;
        }

        // lookup table
        // keep a count of letters
        // what are lettes here
        int[] table = new int[26];

        for (int i = 0; i < t.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            table[ sc - 'a' ]++;
            table[ tc - 'a' ]--;
        }

        // Stream
        return Arrays.stream(table)
            .allMatch( (count) -> count == 0);
    }

    void iter(int[] table, String string, int increment) {
        for (char ch : string.toCharArray()) {
            // ch = 'a' as 0th index
            table[ch - 'a'] += increment;
        }
    }
}