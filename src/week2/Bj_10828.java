package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_10828 {
    private static int[] stack = new int[100];
    private static int top = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String order[] = br.readLine().split(" ");
            switch (order[0]) {
                case "push" :
                    push(Integer.parseInt(order[1]));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(isEmpty()).append("\n");
                    break;
                case "top" :
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
    public static void push(int x) {
        if (stack.length == top) {
            int[] newStack = new int[stack.length*2];
            System.arraycopy(stack, 0, newStack , 0, stack.length);
            stack = newStack;
        }
        stack[top++] = x;
    }

    public static int pop() {
        if (top == 0) {
            return -1;
        }
        return stack[--top];
    }

    public static int size() {
        return top;
    }

    public static int isEmpty() {
        if (top == 0) return 1;
        return 0;
    }

    public static int top() {
        if (top == 0) {
            return -1;
        }
        return stack[top-1];
    }
}
