package Week_3.Day_3;
import java.util.Stack;


// https://leetcode.com/problems/min-stack/
// Rename class to "Solution" before submitting to LeetCode


class MinStack_0155 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack_0155() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);

        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}