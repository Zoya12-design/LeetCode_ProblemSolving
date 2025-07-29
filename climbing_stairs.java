class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1; // ways to reach step 1
        int second = 2; // ways to reach step 2
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = first + second;
            first = second;
            second = current;
        }

        return current;
    }
}
