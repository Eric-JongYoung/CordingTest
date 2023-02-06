package BaekJoon.step13_집합과맵.카드;

import java.io.*;
import java.util.*;

public class N11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long tmp = Long.parseLong(br.readLine());
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }
        long answer = 0 ;
        long max = 0;
        for (long x : map.keySet()) {
            long val = map.get(x);
            if (val > max) {
                max = val;
                answer = x;
            } else if (val == max) {
                answer = Math.min(x, answer);
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

}
