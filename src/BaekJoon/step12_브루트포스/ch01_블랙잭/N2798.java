package BaekJoon.step12_브루트포스.ch01_블랙잭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(N, M, arr));
        br.close();
    }

    public static int solution(int N, int M, int[] arr) {
        int answer = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int s = j + 1; s < N; s++) {
                    int tmp = arr[i] + arr[j] + arr[s];
                    if (tmp == M) {
                        return tmp;
                    }
                    if (answer < tmp && tmp < M)
                        answer = tmp;
                }
            }
        }
        return answer;
    }
}
