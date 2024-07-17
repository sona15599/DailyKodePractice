class Solution {
    public String printString(String s, char ch, int count) {
        // validation
        if (s == null || s.isEmpty()) {
            return "";
        }
        if (count == 0) {
            /*
                Thisisdemostring
                ch = 'x' count = '0'
            */
            return s;
        }

        int i = 0;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                // the char is same
                count--;
            }

            if (count == 0) {
                i++;
                break;
            }
        }

        return i == s.length()? "" : s.substring(i);
    }
}
