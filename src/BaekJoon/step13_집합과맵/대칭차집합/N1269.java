package BaekJoon.step13_집합과맵.대칭차집합;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            map.put(Integer.parseInt(st.nextToken()), 0);
        }
        st = new StringTokenizer(br.readLine());
        int intersection = 0;
        for (int i = 0; i < m; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if (map.containsKey(tmp)) intersection++;
        }
        int answer = n + m - 2 * intersection;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
