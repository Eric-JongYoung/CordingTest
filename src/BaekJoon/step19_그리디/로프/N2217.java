package BaekJoon.step19_그리디.로프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class N2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 내림차순으로 정렬
        Integer[] sortedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedArr, Collections.reverseOrder());
        // 배열의 첫번째 값이 max 값으로 배열의 최대값으로 자동으로 입력 ( 왜냐하면 내림차순이니까)
        int max = sortedArr[0];

        for (int i = 1; i < n; i++) {
            int tmp = sortedArr[i] * (i+1);
            if(tmp>max) max = tmp;
        }
        System.out.println(max);

        br.close();
    }
}
