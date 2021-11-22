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
			//��������
			if(str == null || str.length() == 0) {
				break;
			}
			// Ű �����ϸ� Ű�� �⺻������ +1
			map.put(str, map.getOrDefault(str, 0) + 1);	
			cnt++;
		}
		// Ű���� �迭�� �ٲ㼭 ����
		Object[] keys = map.keySet().toArray();
		Arrays.sort(keys);

		StringBuilder sb = new StringBuilder();
		
		// Object(key, value) ���
		for(Object key : keys) {
			String keyStr = (String) key; 	//Ű
			int count = map.get(keyStr);	//��
			double percent = (double)(count * 100.0) / cnt;
			// �Ǽ��� ������������ �Ҽ��� 4°�ڸ� �ݿø�
			sb.append(keyStr + " " + String.format("%.4f", percent));
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
