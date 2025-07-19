class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the end (least significant digit)
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // No carry needed
                return digits;
            }
            digits[i] = 0;  // Set current digit to 0 and continue loop for carry
        }

        // If all digits were 9, we need a bigger array like [1, 0, 0, ...]
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;  // Leading 1, rest are 0 by default
        return newDigits;
    }
}
