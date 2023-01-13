package BaekJoon.step10_정렬.ch02_대표값2;

import java.util.Arrays;
import java.util.Scanner;

public class N2587 {
    public static void main(String[] args) {
        N2587 T = new N2587();
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solutionAvg(arr));
        System.out.println(T.solutionMid(arr));
    }

    public int solutionAvg(int[] arr) {
        int answer = 0;
        for (int x : arr) {
            answer += x/5;
        }
        return answer;
    }

    public int solutionMid(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        answer = arr[2];

        return answer;
    }
}
