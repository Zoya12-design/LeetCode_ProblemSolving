class Solution {
    public int reverse(int x) {
        long absX = Math.abs((long)x); // Promote to long first!
        String num = Long.toString(absX);
        String reverse = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            reverse += num.charAt(i);
        }

        long result = Long.parseLong(reverse);

        if (result > Integer.MAX_VALUE) {
            return 0;
        }

        return x > 0 ? (int) result : (int) -result;
    }
}
