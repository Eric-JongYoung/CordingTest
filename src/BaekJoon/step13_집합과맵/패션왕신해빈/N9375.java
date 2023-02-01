package BaekJoon.step13_집합과맵.패션왕신해빈;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                st.nextToken();
                String type = st.nextToken();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int answer = 1;
            for (int x : map.values())
                answer *= x + 1;
            bw.write(String.valueOf(answer - 1));
            bw.newLine();

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
