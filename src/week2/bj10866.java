package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class bj10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String[] str1 = str.split(" ");
			if (str1[0].equals("push_front")) {
				int num = Integer.parseInt(str1[1]);
				dq.addFirst(num);
			} else if (str1[0].equals("push_back")) {
				int num = Integer.parseInt(str1[1]);
				dq.addLast(num);
			} else if (str1[0].equals("pop_front")) {
				if(!dq.isEmpty()) sb.append(dq.removeFirst()).append('\n');
				else sb.append(-1).append('\n');
			} else if (str1[0].equals("pop_back")) {
				if(!dq.isEmpty()) sb.append(dq.removeLast()).append('\n');
				else sb.append(-1).append('\n');
			} else if (str1[0].equals("size")) {
				sb.append(dq.size()).append('\n');
			} else if (str1[0].equals("empty")) {
				if(!dq.isEmpty()) sb.append(0).append('\n');
				else sb.append(1).append('\n');
			} else if (str1[0].equals("front")) {
				if(!dq.isEmpty()) sb.append(dq.peekFirst()).append('\n');
				else sb.append(-1).append('\n');
			} else if (str1[0].equals("back")) {
				if(!dq.isEmpty()) sb.append(dq.peekLast()).append('\n');
				else sb.append(-1).append('\n');
			}
		}
		System.out.println(sb.toString());
	}

}
