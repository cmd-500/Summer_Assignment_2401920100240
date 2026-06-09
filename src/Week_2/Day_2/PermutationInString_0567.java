package Week_2.Day_2;
import java.util.*;


// https://leetcode.com/problems/permutation-in-string/
// Rename class to "Solution" before submitting to LeetCode


class PermutationInString_0567 {
    public boolean checkInclusion(String s1, String s2) {

        // for s1 frequency!
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int n = s2.length(), left = 0;
        int window = s1.length();
        Map<Character, Integer> windowMap = new HashMap<>();

        for (int right = 0; right < n; right++) {
            windowMap.put(s2.charAt(right), windowMap.getOrDefault(s2.charAt(right), 0) + 1);

            if (right - left + 1 > window) {
                windowMap.put(s2.charAt(left), windowMap.getOrDefault(s2.charAt(left), 0) - 1);

                if (windowMap.get(s2.charAt(left)) == 0) windowMap.remove(s2.charAt(left));

                left++;
            }

            if (right - left + 1 == window && map.equals(windowMap)) return true;
        }

        return false;
    }
}