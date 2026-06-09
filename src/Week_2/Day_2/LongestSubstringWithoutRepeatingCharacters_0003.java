package Week_2.Day_2;
import java.util.*;


// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Rename class to "Solution" before submitting to LeetCode


class LongestSubstringWithoutRepeatingCharacters_0003 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;

        int n = s.length();

        Set<Character> seen = new HashSet<>();

        for (int right = 0; right < n; right++) {
            char current = s.charAt(right);

            while (seen.contains(current)) {
                seen.remove(s.charAt(left));
                left ++;
            }

            seen.add(current);
            int length = right - left + 1;
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}