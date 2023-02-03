package BaekJoon.step06_문자열.ch04_문자열반복;

import java.io.*;
import java.util.StringTokenizer;

public class N2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            String answer = "";
            st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for (char x : str.toCharArray()) {
                for (int j = 0; j < repeat; j++) {
                    sb.append(x);
                }
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

