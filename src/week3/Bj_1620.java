package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bj_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        int i = 1;
        while (N-- > 0) {
            String name = br.readLine();
            map.put(name, i);
            map2.put(i++, name);
        }
        while (M-- > 0) {
            String key = br.readLine();
            if (map.containsKey(key)) {
                sb.append(map.get(key));
            } else {
                sb.append(map2.get(Integer.parseInt(key)));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
