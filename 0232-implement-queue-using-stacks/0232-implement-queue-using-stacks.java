import java.util.Stack;

class MyQueue {

    private Stack<Integer> in;
    private Stack<Integer> out;

    // Initialize
    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    // Push element to back of queue
    public void push(int x) {
        in.push(x);
    }

    // Remove element from front
    public int pop() {
        if (out.isEmpty()) {
            move();
        }
        return out.pop();
    }

    // Get front element
    public int peek() {
        if (out.isEmpty()) {
            move();
        }
        return out.peek();
    }

    // Check if empty
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    // Helper function to transfer elements
    private void move() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }
}