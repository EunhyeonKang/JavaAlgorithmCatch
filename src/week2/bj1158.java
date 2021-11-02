package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj1158 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		ArrayList<Integer> answer = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(q.size() != 1) {
			for (int i = 0; i < k-1; i++) {
				int tmp = q.poll();
				q.offer(tmp);
			}
			sb.append(q.poll() + ", ");
		}
		sb.append(q.poll() + ">");

		bw.write(sb.toString() + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
