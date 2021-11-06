package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class bj2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		int i = 0;
		for (i = 1; i <= n; i++)
			q.offer(i);
		i = 0;
		while (q.size() != 1) {
			i++;
			if (i % 2 != 0) {
				q.poll();

			} else {
				q.offer(q.poll());
			}
		}
		System.out.println(q.peek());
	}
}
