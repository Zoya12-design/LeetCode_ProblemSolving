public class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; // Square root of 0 is 0; of 1 is 1

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // To prevent overflow, use long for mid*mid
            long sq = (long) mid * mid;

            if (sq == x) {
                return mid;
            } else if (sq < x) {
                ans = mid;      // this could be the answer
                left = mid + 1; // try to find a bigger one
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
