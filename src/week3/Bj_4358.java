package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Bj_4358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();

        String name = br.readLine();
        double total = 0;
        while (true) {
            map.put(name, map.getOrDefault(name, 0) + 1);
            total++;
            name = br.readLine();
            if(name == null || name.length() == 0) break;
        }

        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys);

        for (Object key : keys) {
            double percent = map.get(key) / total * 100;
            sb.append(key).append(" ").append(String.format("%.4f", percent)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
