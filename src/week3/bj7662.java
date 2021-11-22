package week3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class bj7662 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) { 
			int k = sc.nextInt();
			TreeMap<Integer, Integer> ts = new TreeMap<>();
			for (int iter = 0; iter < k; iter++) {
				char c = sc.next().charAt(0);
				int n = sc.nextInt();
				if (c == 'I') {
					ts.put(n, ts.getOrDefault(n, 0) + 1);
				} else if (!ts.isEmpty()) {
					int key;
					if (n == 1) {
						key = ts.lastKey();
						if (ts.get(key) > 1)
							ts.put(key, ts.get(key) - 1);
						else
							ts.pollLastEntry();
					} else {
						key = ts.firstKey();
						if (ts.get(key) > 1)
							ts.put(key, ts.get(key) - 1);
						else
							ts.pollFirstEntry();
					}
				}
			}
			if (ts.isEmpty())
				System.out.println("EMPTY");
			else
				System.out.println(ts.lastKey() + " " + ts.firstKey());
		}
	}
}
