package Week_2.Day_1;


// https://leetcode.com/problems/ransom-note/
// Rename class to "Solution" before submitting to LeetCode


class RansomNote_0383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] freq = new int[26];

        for (char ch : magazine.toCharArray()) freq[ch - 'a']++;

        for (char ch : ransomNote.toCharArray()) {
            if (--freq[ch - 'a'] < 0) return false;
        }

        return true;
    }
}