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
			if(str == null || str.length() == 0) {
				break;
			}
			map.put(str, map.getOrDefault(str, 0) + 1);	// 키 존재하면 키의 기본값에서 +1
			cnt++;
		}
		// 키값을 배열로 바꿔서 정렬
		Object[] keys = map.keySet().toArray();
		Arrays.sort(keys);
		
		StringBuilder sb = new StringBuilder();
		
		// Object(key, value) 출력
		for(Object key : keys) {
			String keyStr = (String) key;
			int count = map.get(keyStr);
			double percent = (double)(count * 100.0) / cnt;
			sb.append(keyStr + " " + String.format("%.4f", percent));	// 실수형 숫자형식으로 소수점 4째자리 반올림
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
