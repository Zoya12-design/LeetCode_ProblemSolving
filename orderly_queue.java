class Solution {
    public String orderlyQueue(String s, int k) {
        if (k == 1) {
            String min = s;
            int n = s.length();

            for (int i = 1; i < n; i++) {
                // Rotate string: move i-th prefix to end
                String rotated = s.substring(i) + s.substring(0, i);
                if (rotated.compareTo(min) < 0) {
                    min = rotated;
                }
            }
            return min;
        } else {
            // For k > 1, we can sort the string
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
    }
}
