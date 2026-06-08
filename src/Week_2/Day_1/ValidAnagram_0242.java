package Week_2.Day_1;
import java.util.*;


// https://leetcode.com/problems/valid-anagram/
// Rename class to "Solution" before submitting to LeetCode


class ValidAnagram_0242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        Arrays.sort(arrayS);
        Arrays.sort(arrayT);

        return Arrays.equals(arrayS, arrayT);

    }
}