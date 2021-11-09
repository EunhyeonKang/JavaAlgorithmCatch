package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class bj14425 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split(" ");
		Set<String> x = new HashSet<String>();
		Set<String> y = new HashSet<String>();
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		for (int i = 0; i < N; i++) {
			String name = br.readLine();
			x.add(name);
		}
		int answer = 0;
		for (int i = 0; i < M; i++) {
			String name = br.readLine();
			y.add(name);
			if (x.contains(name)) {
				answer++;
			}
		}

		System.out.println(answer);
	}

}
