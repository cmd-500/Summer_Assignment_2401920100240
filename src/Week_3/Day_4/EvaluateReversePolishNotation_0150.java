package Week_3.Day_4;
import java.util.Stack;


// https://leetcode.com/problems/evaluate-reverse-polish-notation/
// Rename class to "Solution" before submitting to LeetCode


class EvaluateReversePolishNotation_0150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {

                int a = stack.pop();
                int b = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(b + a);
                        break;

                    case "-":
                        stack.push(b - a);
                        break;

                    case "*":
                        stack.push(b * a);
                        break;

                    case "/":
                        stack.push(b / a);
                        break;
                }

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }
}