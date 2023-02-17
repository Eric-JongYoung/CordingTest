package BaekJoon.step12_브루트포스.일곱난쟁이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int sum =0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        for (int i = 0; i < 8; i++) {
            for(int j = i+1; j<9; j++){
                int tmp = sum - (arr[i] + arr[j]);
                if(tmp==100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    for (int k = 0; k < 9; k++) {
                        if(arr[k]>0) System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }

        br.close();
    }
}
