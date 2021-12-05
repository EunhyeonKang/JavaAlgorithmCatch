package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class bj21921 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sT = new StringTokenizer(br.readLine().trim());
		Map<Integer, Integer> map = new HashMap<>();
		int N = Integer.parseInt(sT.nextToken());
		int X = Integer.parseInt(sT.nextToken());
		int[] arr = new int[N + 1];
		int[] tmp = new int[N + 1];
		sT = new StringTokenizer(br.readLine().trim());
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(sT.nextToken());
		}
		for (int i = 1; i <= N; i++) {
			tmp[i] = tmp[i - 1] + arr[i];
		}
		int p1 = 1;
		int max = Integer.MIN_VALUE;
		while (X + p1 <= N + 1) {
			int a = tmp[X + p1 - 1] - tmp[p1 - 1];
			max = Math.max(max, a);
			map.put(a, map.getOrDefault(a, 0) + 1);
			p1++;
		}
		if (max == 0) {
			System.out.println("SAD");
		} else {
			System.out.println(max);
			System.out.println(map.get(max));
		}
	}
}
