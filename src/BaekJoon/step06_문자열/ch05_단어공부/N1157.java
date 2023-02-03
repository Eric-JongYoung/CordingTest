package BaekJoon.step06_문자열.ch05_단어공부;

import java.io.*;
import java.util.HashMap;

public class N1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toUpperCase().toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        char answer = '?';
        int max = Integer.MIN_VALUE;

        for (char x : map.keySet()) {
            int tmp = map.get(x);
            if (tmp > max) {
                max = tmp;
                answer = x;
            } else if (tmp == max) {
                answer = '?';
            }
        }
        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();
    }
}

