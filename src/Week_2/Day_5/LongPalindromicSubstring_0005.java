package Week_2.Day_5;


// https://leetcode.com/problems/longest-palindromic-substring/
// Rename class to "Solution" before submitting to LeetCode


class LongPalindromicSubstring_0005 {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLength = 1;

        int n = s.length();

        for (int i = 0; i < n; i++) {

            // odd
            int left = i, right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    start = left;
                    maxLength = right - left + 1;
                }
                left--;
                right++;
            }

            // even
            left = i;
            right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    start = left;
                    maxLength = right - left + 1;
                }
                left--;
                right++;
            }
        }

        return s.substring(start, start + maxLength);
    }
}