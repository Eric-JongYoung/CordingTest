package BaekJoon.step13_집합과맵.문자열집합;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), 0);
        }
        int answer = 0 ;
        for (int i = 0; i < m; i++) {
            String tmp = br.readLine();
            if(map.containsKey(tmp)) answer++;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

}
