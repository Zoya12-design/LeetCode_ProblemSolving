class Solution {
    public String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            String p1 = expand(s, i, i);       // odd length (e.g. "aba")
            String p2 = expand(s, i, i + 1);   // even length (e.g. "abba")

            if (p1.length() > longest.length()) {
                longest = p1;
            }
            if (p2.length() > longest.length()) {
                longest = p2;
            }
        }

        return longest;
    }

    private String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }
}
