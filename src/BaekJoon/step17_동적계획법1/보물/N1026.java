package BaekJoon.step17_동적계획법1.보물;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class N1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrA);
        Integer[] arrBB = Arrays.stream(arrB).boxed().toArray(Integer[]::new);
        Arrays.sort(arrBB, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arrA[i] * arrBB[i];
        }
        System.out.println(sum);
    }
}