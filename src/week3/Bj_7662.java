package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Bj_7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        TreeMap<Integer, Integer> map;
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            map = new TreeMap<>();
            int order = Integer.parseInt(br.readLine());
            while (order-- > 0) {
                st = new StringTokenizer(br.readLine());
                boolean isInsert = st.nextToken().charAt(0) == 'I';
                int data = Integer.parseInt(st.nextToken());
                if (isInsert) {
                    map.put(data, map.getOrDefault(data, 0) + 1);
                } else if (!map.isEmpty()){
                    int k = data == -1 ? map.firstKey() : map.lastKey();
                    if (map.put(k, map.get(k) - 1) == 1) {
                        map.remove(k);
                    }
                }
            }
            if (map.isEmpty()) {
                sb.append("EMPTY").append("\n");
            } else {
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
