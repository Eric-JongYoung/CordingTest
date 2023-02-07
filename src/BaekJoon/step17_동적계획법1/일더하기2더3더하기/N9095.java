package BaekJoon.step17_동적계획법1.일더하기2더3더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9095 {
    static int[] arr = new int[12];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 4; i <= 11; i++) {
            arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
        }
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(arr[n]);
        }
        br.close();
    }

}