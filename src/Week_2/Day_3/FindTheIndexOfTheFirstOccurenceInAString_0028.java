package Week_2.Day_3;


// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Rename class to "Solution" before submitting to LeetCode


class FindTheIndexOfTheFirstOccurenceInAString_0028 {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (needle.equals(haystack.substring(i, i + needle.length()))) return i;
        }

        return -1;
    }
}