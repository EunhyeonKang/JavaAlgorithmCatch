package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj18258 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Queue<String> que = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		String back = "";
		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			if (input.equals("push")) {
				String p = st.nextToken();
				back = p;
				que.add(p);
			} else if (input.equals("pop")) {
				bw.write(que.isEmpty() ? "-1" : que.poll());
				bw.newLine();
			} else if (input.equals("size")) {
				bw.write(String.valueOf(que.size()));
				bw.newLine();

			} else if (input.equals("empty")) {
				bw.write(que.isEmpty() ? "1" : "0");
				bw.newLine();

			} else if (input.equals("front")) {
				bw.write(que.isEmpty() ? "-1" : que.peek());
				bw.newLine();

			} else {
				bw.write(que.isEmpty() ? "-1" : back);
				bw.newLine();

			}
		}
		bw.flush();
		bw.close();
	}

}
