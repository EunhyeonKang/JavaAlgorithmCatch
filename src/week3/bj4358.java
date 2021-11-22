package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class bj4358 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int cnt=0;
		while(true) {
			String str = br.readLine();
			//종료조건
			if(str == null || str.length() == 0) {
				break;
			}
			// 키 존재하면 키의 기본값에서 +1
			map.put(str, map.getOrDefault(str, 0) + 1);	
			cnt++;
		}
		// 키값을 배열로 바꿔서 정렬
		Object[] keys = map.keySet().toArray();
		Arrays.sort(keys);

		StringBuilder sb = new StringBuilder();
		
		// Object(key, value) 출력
		for(Object key : keys) {
			String keyStr = (String) key; 	//키
			int count = map.get(keyStr);	//값
			double percent = (double)(count * 100.0) / cnt;
			// 실수형 숫자형식으로 소수점 4째자리 반올림
			sb.append(keyStr + " " + String.format("%.4f", percent));
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
