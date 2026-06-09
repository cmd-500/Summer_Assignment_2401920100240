package Week_2.Day_2;
import java.util.*;


// https://leetcode.com/problems/find-all-anagrams-in-a-string/
// Rename class to "Solution" before submitting to LeetCode


class FindAllAnagramsInAString_0438 {
    public List<Integer> findAnagrams(String s, String p) {

        // for p frequency!
        Map<Character, Integer> forP = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            forP.put(p.charAt(i), forP.getOrDefault(p.charAt(i), 0) + 1);
        }

        int n = s.length(), left = 0;
        int window = p.length();
        Map<Character, Integer> windowMap = new HashMap<>();

        List<Integer> ans = new ArrayList<>();

        for (int right = 0; right < n; right++) {
            windowMap.put(s.charAt(right), windowMap.getOrDefault(s.charAt(right), 0) + 1);

            if (right - left + 1 > window) {
                windowMap.put(s.charAt(left), windowMap.getOrDefault(s.charAt(left), 0) - 1);

                if (windowMap.get(s.charAt(left)) == 0) windowMap.remove(s.charAt(left));

                left++;
            }

            if (right - left + 1 == window && forP.equals(windowMap)) ans.add(left);
        }

        return ans;
    }
}