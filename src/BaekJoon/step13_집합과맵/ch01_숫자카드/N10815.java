package BaekJoon.step13_집합과맵.ch01_숫자카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            map.put(tmp, 0);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if(map.containsKey(tmp)) System.out.print(1 + " ");
            else System.out.print(0 +" ");
        }
        br.close();
    }
}
