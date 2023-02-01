package BaekJoon.step13_집합과맵.베스트셀러;

import java.io.*;
import java.util.*;

public class N1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            map.put(tmp, map.getOrDefault(tmp,0)+1);
        }

        int max = 0;
        String answer = "";

        for (String x : map.keySet()) {
            max = Math.max(max, map.get(x));
        }
        ArrayList<String> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr);

        for (String x : arr) {
            if (map.get(x) == max) {
                answer = x;
                break;
            }
        }

        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();
    }
}
