package Week_2.Day_5;


// https://leetcode.com/problems/string-compression/
// Rename class to "Solution" before submitting to LeetCode


class StringCompression_0443 {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;

        int writeIndex = 0, readIndex = 0;

        while (readIndex < chars.length) {
            char currentChar = chars[readIndex];
            int count = 0;

            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                readIndex++;
                count++;
            }

            chars[writeIndex++] = currentChar;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[writeIndex++] = c;
                }
            }
        }

        return writeIndex;
    }
}