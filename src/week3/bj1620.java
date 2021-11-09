package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class bj1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split(" ");
		
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		String[] arr = new String[N+1];
		Map<String,Integer> map = new HashMap<>();
		for(int i=1;i<=N;i++) {
			String nick = br.readLine(); 
			map.put(nick,i);
			arr[i] = nick;
		}
		for(int i=0;i<M;i++) {
			String input = br.readLine();
			if(!isString(input)) {
				int idx = Integer.parseInt(input);
				System.out.println(arr[idx]);
			}else {
				System.out.println(map.get(input));
			}
	
		}		
	}

	private static boolean isString(String input) {
		boolean tmp = true;
		for(Character c : input.toCharArray()) {
			if(!Character.isAlphabetic(c)) tmp = false;
			else tmp=true;
		}return tmp;
	}
}
