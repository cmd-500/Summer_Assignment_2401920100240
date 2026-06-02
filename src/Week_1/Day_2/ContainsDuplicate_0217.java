package Week_1.Day_2;
import java.util.*;


// https://leetcode.com/problems/contains-duplicate/
// Rename class to "Solution" before submitting to LeetCode


class ContainsDuplicate_0217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) return true;

            seen.add(num);
        }

        return false;
    }
}