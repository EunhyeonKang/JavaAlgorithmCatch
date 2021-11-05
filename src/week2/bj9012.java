package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < n; i++) {
			String answer = "YES";
			String str = br.readLine();
			for (char x : str.toCharArray()) {
				if (x == '(') {
					s.push(x);
				} else {
					if (!s.isEmpty()) {
						if (s.peek() == '(') {
							s.pop();
						}
					} else {
						answer = "NO";
						break;
					}
				}
			}
			if (!s.isEmpty())
				answer = "NO";
			System.out.println(answer);
			s.clear();
		}
	}

}
