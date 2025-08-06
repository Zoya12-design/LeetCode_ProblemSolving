class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // Convert to long to avoid overflow, and work with positive values
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int result = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            int multiple = 1;

            // Double the divisor until it's just less than the dividend
            while (dvd >= (temp << 1)) {
                temp <<= 1;        // temp = temp * 2
                multiple <<= 1;    // multiple = multiple * 2
            }

            dvd -= temp;
            result += multiple;
        }

        // Determine the sign of the result
        if ((dividend < 0) ^ (divisor < 0)) {
            return -result;
        } else {
            return result;
        }
    }
}
/*Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.
 */