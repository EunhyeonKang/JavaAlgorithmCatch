package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sT = new StringTokenizer(br.readLine().trim());
		int N = Integer.parseInt(sT.nextToken());
		int M = Integer.parseInt(sT.nextToken());
		int[] arr = new int[N + 1];
		//누적 합 배열
		int[] tmp = new int[N + 1];
		sT = new StringTokenizer(br.readLine().trim());
		for (int i = 1; i <= N; i++)
			arr[i] = Integer.parseInt(sT.nextToken());

		for (int i = 1; i <= N; i++)
			tmp[i] = tmp[i - 1] + arr[i];

		for (int i = 0; i < M; i++) {
			sT = new StringTokenizer(br.readLine().trim());
			int p1 = Integer.parseInt(sT.nextToken());
			int p2 = Integer.parseInt(sT.nextToken());
			System.out.println(tmp[p2] - tmp[p1 - 1]);
		}
	}

}
