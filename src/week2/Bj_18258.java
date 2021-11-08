package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_18258 {
    static int[] queue = new int[1000];
    static int front = 0;
    static int back = 0;
    public static void push(int n) {
        if (back == queue.length) {
            int[] newQueue = new int[queue.length * 2];
            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            queue = newQueue;
        }
        queue[back++] = n;
    }
    public static int pop() {
        if (size() == 0) {
            front = 0;
            back = 0;
            return - 1;
        }
        return queue[front++];
    }
    public static int size() {
        return back - front;
    }
    public static int empty() {
        return size() == 0 ? 1 : 0;
    }
    public static int front() {
        if (size() == 0) {
            return -1;
        }
        return queue[front];
    }
    public static int back() {
        if (size() == 0) {
            return -1;
        }
        return queue[back-1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String[] order = br.readLine().split(" ");
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
                    sb.append(empty()).append("\n");
                    break;
                case "front" :
                    sb.append(front()).append("\n");
                    break;
                case "back" :
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}

