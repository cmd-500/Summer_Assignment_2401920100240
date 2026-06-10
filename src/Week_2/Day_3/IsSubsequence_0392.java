package Week_2.Day_3;


// https://leetcode.com/problems/is-subsequence/
// Rename class to "Solution" before submitting to LeetCode


class IsSubsequence_0392 {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int i = 0;
        int j = 0;

        while (j < t.length()) {
            if (i < s.length() && s.charAt(i) == t.charAt(j)) i++;

            if (i == s.length()) return true;

            j++;
        }

        return false;
    }
}