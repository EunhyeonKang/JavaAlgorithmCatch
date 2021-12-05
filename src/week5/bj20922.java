package week5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj20922 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sT = new StringTokenizer(br.readLine().trim());
		int N = Integer.parseInt(sT.nextToken());
		int K = Integer.parseInt(sT.nextToken());
		int[] arr = new int[N];
		int[] tmp = new int[100001];
		sT = new StringTokenizer(br.readLine().trim());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(sT.nextToken());
		}
		int max = Integer.MIN_VALUE;
		int cnt = 0;
		int e = 0, s = 0;

		for (int p1 = 0; p1 < N; p1++) {
			if (tmp[arr[p1]] < K) {
				e = p1;
				tmp[arr[p1]]++;
				max = Math.max(e - s + 1, max);
			} else {
				while (true) {
					if (arr[s] == arr[p1]) {
						s++;
						e = p1;
						break;
					} else {
						tmp[arr[s]]--;
						s++;
					}
				}
			}
		}
		System.out.println(max);
        System.exit(0);
	}
}
