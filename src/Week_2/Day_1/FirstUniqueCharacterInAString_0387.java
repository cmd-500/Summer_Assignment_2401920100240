package Week_2.Day_1;
import java.util.*;


// https://leetcode.com/problems/first-unique-character-in-a-string/
// Rename class to "Solution" before submitting to LeetCode


class FirstUniqueCharacterInAString_0387 {
    public int firstUniqChar(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }
}