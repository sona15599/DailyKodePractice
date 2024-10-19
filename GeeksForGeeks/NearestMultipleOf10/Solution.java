package GeeksForGeeks.NearestMultipleOf10;

class Solution {
    String roundToNearest(String str) {
        // Complete the function
        
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("invalid number");
        }
        
        final int lastIndex = str.length() - 1;
        // decrease the value
        if (str.charAt(lastIndex) <= '5') {
            return str.substring(0, lastIndex) + "0";
        }
        
        // inc the value
        // (2)9 -> 30 
        // 29 -> 20 -> 30
        // 2(2)9 -> 230
        // 19(9)9 -> 2000
        // (9)9 -> 100 // 99 -> 90 -> 00 -> toAdd = true -> 100
        
        char[] s = str.toCharArray();
        s[lastIndex] = '0';
        boolean toAdd = true;
        for (int i = lastIndex - 1; i >= 0; i--) {
            if (!toAdd) break;
            
            if (s[i] == '9') {
                toAdd = true;
                s[i] = '0';
            } else {
                toAdd = false;
                s[i]++;
            }
        }
        
        String prefix = "";
        if (toAdd) {
            prefix = "1";
        }
        
        return prefix + new String(s);
    }
}