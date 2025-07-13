class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int ast : asteroids) {
            boolean alive = true;

            while(!stack.isEmpty() && ast < 0 && stack.peek() > 0) {
                int top = stack.peek();

                if (top < -ast) {
                    stack.pop();
                } else if (top == -ast) {
                    stack.pop();
                    alive = false;
                    break;
                } else {
                    alive = false;
                    break;
                }
            }
            if (alive) {
                stack. push(ast);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >=0 ; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
