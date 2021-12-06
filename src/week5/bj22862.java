package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj22862 {
	static int[] S;
	public static void main(String[] args) throws IOException {
		// 길이가 N -> 수열 S
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sT = new StringTokenizer(br.readLine().trim());
		int N = Integer.parseInt(sT.nextToken());
		int K = Integer.parseInt(sT.nextToken());
		S = new int[N];
		int[] C = new int[100001];
		
		sT = new StringTokenizer(br.readLine().trim());
		for (int i = 0; i < N; i++) {
			S[i] = Integer.parseInt(sT.nextToken());
		}
		
	    int left = 0;
	    int right = 0;
	    int cnt = 0;

	    if (S[0] % 2 == 1) cnt++;

	    int answer = 0;
	    while (right < N) {
	        if (cnt < K) { 
	            right++;
	            if (right < N && S[right] % 2 == 1) cnt++;
	            answer = Math.max(answer, right - left - cnt);
	        } else if (cnt == K) {
	            right++;
	            while (right < N && S[right] % 2 == 0) {
	                right++;
	            }
	            cnt++;
	            answer = Math.max(answer, right - left - K);	//K번 삭제
	        } else {
	            while (true) {
	                if (S[left] % 2 == 0)
	                    left++;
	                else
	                    break;
	            }
	            left++;
	            cnt--;
	        }
	    }
		System.out.println(answer);
		
		System.exit(0);
	}
}
