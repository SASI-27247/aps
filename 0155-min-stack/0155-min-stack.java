import java.util.Stack;

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Initialize
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element
    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    // Pop element
    public void pop() {
        stack.pop();
        minStack.pop();
    }

    // Get top element
    public int top() {
        return stack.peek();
    }

    // Get minimum element
    public int getMin() {
        return minStack.peek();
    }
}