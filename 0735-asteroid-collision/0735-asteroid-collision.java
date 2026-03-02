import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean alive = true;

            // Collision only if stack top > 0 and current < 0
            while (alive && !stack.isEmpty() && stack.peek() > 0 && a < 0) {
                int top = stack.peek();

                if (top < -a) {
                    // top explodes, current continues
                    stack.pop();
                } else if (top == -a) {
                    // both explode
                    stack.pop();
                    alive = false;
                } else {
                    // current explodes
                    alive = false;
                }
            }

            if (alive) {
                stack.push(a);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}