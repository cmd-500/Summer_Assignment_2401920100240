package Week_1.Day_5;


// https://leetcode.com/problems/longest-common-prefix/
// Rename class to "Solution" before submitting to LeetCode


class LongestCommonPrefix_0014 {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";

        String referString = strs[0];

        for (int i = 0; i < referString.length(); i++) {
            char ch = referString.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return referString.substring(0, i);
                }
            }
        }

        return referString;
    }
}
