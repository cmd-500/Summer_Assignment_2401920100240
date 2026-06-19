package Week_3.Day_5;
import java.util.Stack;


// https://leetcode.com/problems/implement-queue-using-stacks/
// Rename class to "Solution" before submitting to LeetCode


class ImplementQueueUsingStacks_0232 {

    Stack<Integer> stack;
    Stack<Integer> queue;

    public MyQueue() {
        stack = new Stack<>();
        queue = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        stackToQueue();

        return queue.pop();
    }

    public int peek() {
        stackToQueue();

        return queue.peek();
    }

    public boolean empty() {
        return stack.isEmpty() && queue.isEmpty();
    }

    private void stackToQueue() {
        if (queue.isEmpty()) {
            while (!stack.isEmpty()) {
                queue.push(stack.pop());
            }
        }
    }
}