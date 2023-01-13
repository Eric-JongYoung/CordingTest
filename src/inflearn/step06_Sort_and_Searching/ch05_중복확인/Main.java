package inflearn.step06_Sort_and_Searching.ch05_중복확인;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }

    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if(arr[i]==arr[i+1]) return "D";
        }
        return answer;
    }
}

/**
 * 해쉬맵으로 하면 O(n) 임 그러나 정렬로도 된다는걸 보여주려고
 * 정렬로 풀면 O(nlogn)
 * */