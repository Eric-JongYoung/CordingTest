package BaekJoon.step17_동적계획법1.ch12_가장긴증가하는부분수열;

import java.util.Scanner;

public class N11053 {
    static int[] dy;

    public int solution(int[] arr) {
        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        N11053 T = new N11053();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            if(arr[0]<arr[1]) System.out.println(2);
            else System.out.println(1);
        } else {
            System.out.println(T.solution(arr));
        }

    }
}

