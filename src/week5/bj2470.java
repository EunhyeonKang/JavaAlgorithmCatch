package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj2470 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] S = new int[N];
		int[] answer = new int[2];
		StringTokenizer sT = new StringTokenizer(br.readLine().trim());
		for (int i = 0; i < N; i++) {
			S[i] = Integer.parseInt(sT.nextToken());
		}
		Arrays.sort(S);
	    int start = 0; 
	    int end = N - 1; 
	    int min = Integer.MAX_VALUE; 
	    while (start < end) {
	        int sum = S[start] + S[end];

	        if (min > Math.abs(sum)) {
	            min = Math.abs(sum);
	            answer[0] = S[start];
	            answer[1] = S[end]; 

	            if (sum == 0)
	                break;
	        }

	        if (sum < 0) 
	            start++;
	        else 
	            end--;
	    }
	    for(int x:answer) {
	    	System.out.print(x+" ");
	    }
	}
}
