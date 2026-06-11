package Week_2.Day_4;
import java.util.Stack;


// https://leetcode.com/problems/decode-string/
// Rename class to "Solution" before submitting to LeetCode


class DecodeString_0394 {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();

        int k = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // '1' then '2' becomes 12 & so on!
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decodedString = stringStack.pop();
                int currentK = countStack.pop();

                // multiplying inner string & appending
                for (int i = 0; i < currentK; i++) decodedString.append(currentString);

                currentString = decodedString;
            } else {
                // standard letter
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
}