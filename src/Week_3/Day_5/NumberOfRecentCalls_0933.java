package Week_3.Day_5;
import java.util.*;


// https://leetcode.com/problems/number-of-recent-calls/
// Rename class to "Solution" before submitting to LeetCode


class NumberOfRecentCalls_0933 {
    private Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.add(t);

        while (q.peek() < t - 3000) q.poll();

        return q.size();
    }
}