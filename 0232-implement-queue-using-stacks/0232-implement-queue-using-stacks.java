import java.util.Stack;

class MyQueue {

    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    // Push element x to the back of the queue
    public void push(int x) {
        inStack.push(x);
    }

    // Removes the element from the front of the queue and returns it
    public int pop() {
        shiftStacksIfNeeded();
        return outStack.pop();
    }

    // Returns the element at the front of the queue
    public int peek() {
        shiftStacksIfNeeded();
        return outStack.peek();
    }

    // Returns true if the queue is empty
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    // Move elements only when outStack is empty
    private void shiftStacksIfNeeded() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}
