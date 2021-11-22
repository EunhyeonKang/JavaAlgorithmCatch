package week4;

import java.util.ArrayList;
import java.util.Scanner;

public class bj33840359 {
	static ArrayList<Integer>[] arr;
	static int[] parents;
	static int[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new ArrayList[n + 1];
		visited = new int[n + 1];
		parents = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a].add(b);
			arr[b].add(a);
		}
		for (int i = 1; i <= n; i++) {
			if (visited[i] == 0)
				dfs(i);
		}
		for (int i = 2; i <= n; i++) {
			System.out.println(parents[i]);
		}
	}

	public static void dfs(int t) {
		if (visited[t] == 1)
			return;
		visited[t] = 1;
		for (int tt : arr[t]) {
			if (visited[tt] == 0) {
				parents[tt] = t;
				dfs(tt);
			}
		}
	}

}
