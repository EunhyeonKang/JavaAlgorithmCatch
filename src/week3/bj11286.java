package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class bj11286 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		Queue<Integer> que = new PriorityQueue<>((d1, d2) ->
	    Math.abs(d1) == Math.abs(d2) ? Integer.compare(d1, d2) : Integer.compare(Math.abs(d1), Math.abs(d2))
				);
		//1. ���밪�� ������ ���ڱ������� ����
		//2. ���밪�� �ٸ��� ���밪�������� ����
		for(int i=0;i<n;i++) {
			int x = Integer.parseInt(br.readLine());
			if(x==0) {
				if(!que.isEmpty()) {
					int tmp = que.poll();
					System.out.println(tmp);
				}else {
					System.out.println(0);
				}
			}else {
				que.add(x);
			}
		}
	}

}
