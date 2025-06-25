class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int maxCount = 0;
        String current = "";

        for (int i = 0; i < s.length(); i++) {
            current = ""; 
            count = 0;

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (current.indexOf(ch) != -1) {
                    break;
                } else {
                    current += ch;
                    count++;
                }
            } 
            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println(maxCount);
        return maxCount; 
    }
}
