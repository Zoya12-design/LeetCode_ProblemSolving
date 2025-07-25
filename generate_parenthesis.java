import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        return result;
    }

    // Helper function
    void generate(List<String> result, String current, int open, int close, int n) {
        // Jab pura combination ban gaya
        if (current.length() == 2 * n) {
            result.add(current); // Save it
            return;
        }

        // Jab aur '(' laga sakte hain
        if (open < n) {
            generate(result, current + "(", open + 1, close, n);
        }

        // Jab aur ')' laga sakte hain (agar open brackets se kam hain)
        if (close < open) {
            generate(result, current + ")", open, close + 1, n);
        }
    }
}
