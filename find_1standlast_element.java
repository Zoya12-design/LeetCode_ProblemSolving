class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1}; // Default answer if target not found
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (!found) {
                    ans[0] = i; // first occurrence
                    found = true;
                }
                ans[1] = i; // last occurrence keeps updating
            }
        }

        return ans;
    }
}
