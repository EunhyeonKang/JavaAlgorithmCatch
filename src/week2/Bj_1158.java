package week2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        bw.write(doJosep(N, K));
        bw.flush();
    }

    public static String doJosep(int N, int K) {
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("<");
        for (int i = 1; i < N + 1; i++) {
            list.add(i);
        }

        int index = 0;
        while (!list.isEmpty()) {
            index = (index + K - 1) % list.size();
            sb.append(list.remove(index));
            if(!list.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
