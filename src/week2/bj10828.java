package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;


public class bj10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s= st.nextToken();
			if(s.equals("push")) {
				int k = Integer.parseInt(st.nextToken());
				stack.push(k);
			}else if(s.equals("top")) {
				if(stack.isEmpty()) {
					list.add(-1);
				}else {
					list.add(stack.peek());
				}
			}else if(s.equals("size")) {
				list.add(stack.size());
			}else if(s.equals("empty")) {
				if(stack.isEmpty()) {
					list.add(1);
				}else {
					list.add(0);
				}
			}else if(s.equals("pop")) {
				if(stack.isEmpty()) {
					list.add(-1);
				}else {
					list.add(stack.pop());
				}
			}
		}
		
		for(int x : list) {
			System.out.println(x);
		}
	}

}
