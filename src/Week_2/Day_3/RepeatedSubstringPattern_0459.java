package Week_2.Day_3;


// https://leetcode.com/problems/repeated-substring-pattern/
// Rename class to "Solution" before submitting to LeetCode


class RepeatedSubstringPattern_0459 {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}