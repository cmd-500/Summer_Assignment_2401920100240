package Week_1.Day_5;


// https://leetcode.com/problems/reverse-string/
// Rename class to "Solution" before submitting to LeetCode


class ReverseString_0344 {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

    }
}
