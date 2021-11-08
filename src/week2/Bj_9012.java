package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-->0) {
            sb.append(checkVPS(br.readLine())).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static String checkVPS(String str) {
        int open = 0;
        for (int i=0; i<str.length(); i++) {
            if (open < 0) return "NO";
            if (str.charAt(i) == '(') {
                open++;
            } else {
                open--;
            }
        }
        if (open == 0) return "YES";
        return "NO";
    }
}

