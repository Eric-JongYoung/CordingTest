package BaekJoon.step07_기본수학1.숫자의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;

public class N2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        int mix = a * b * c;

        for (char x : String.valueOf(mix).toCharArray()) {
            map.put((int)x -'0', map.getOrDefault((int)x -'0', 0) + 1);
        }

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int tmp = map.getOrDefault(i, 0);
            arr[i] = tmp;
        }
        for (int x : arr) {
            System.out.println(x);
        }


        br.close();
    }
}
