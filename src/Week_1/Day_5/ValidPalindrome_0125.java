package Week_1.Day_5;


// https://leetcode.com/problems/valid-palindrome/
// Rename class to "Solution" before submitting to LeetCode


class ValidPalindrome_0125 {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        String str = cleaned.toString();

        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
