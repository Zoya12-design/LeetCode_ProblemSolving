class Solution {
    public boolean isNumber(String s) {
        s = s.trim(); // remove leading/trailing spaces
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        boolean numAfterE = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                numSeen = true;
                if (eSeen) numAfterE = true;
            } else if (ch == '+' || ch == '-') {
                // Sign must be at the beginning or just after e/E
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (ch == '.') {
                // Decimal point must not appear after e or again
                if (dotSeen || eSeen) {
                    return false;
                }
                dotSeen = true;
            } else if (ch == 'e' || ch == 'E') {
                // e/E must not appear twice and must follow a number
                if (eSeen || !numSeen) {
                    return false;
                }
                eSeen = true;
                numAfterE = false; // reset for checking number after e
            } else {
                return false;
            }
        }

        return numSeen && numAfterE;
    }
}
