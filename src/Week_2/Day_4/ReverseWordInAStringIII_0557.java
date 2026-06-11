package Week_2.Day_4;


// https://leetcode.com/problems/reverse-words-in-a-string-iii/
// Rename class to "Solution" before submitting to LeetCode


class ReverseWordInAStringIII_0557 {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder sentence = new StringBuilder();
        for (String word : words) sentence.append(reverse(word)).append(" ");

        return sentence.toString().trim();
    }

    public String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}