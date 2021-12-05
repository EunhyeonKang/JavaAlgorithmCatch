package week5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj11728 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer sT = new StringTokenizer(sc.nextLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(sT.nextToken());
		int M = Integer.parseInt(sT.nextToken());
		int[] arrN = new int[N];
		int[] arrM = new int[M];
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			arrN[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			arrM[i] = sc.nextInt();
		}
		int p1 = 0, p2 = 0;
		while(p1<N&&p2<M) {
			if (arrN[p1] < arrM[p2]) {
				arr.add(arrN[p1]);
				p1++;
			} else {
				arr.add(arrM[p2]);
				p2++;
			}
		}
		while (p1 < N) {
			arr.add(arrN[p1++]);
		} 
		while(p2<M) {
			arr.add(arrM[p2++]);
		}
		for (int x : arr) {
			sb.append(x+" ");
		}
		System.out.print(sb);
	}
}
