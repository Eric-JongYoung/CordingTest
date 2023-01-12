package inflearn.step06_Sort_and_Searching.ch01_선택정렬;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(N, arr)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n-1 ; i++) { // 마지막 자리 까지 갈 필요 없으니까 한번이라도 덜 돌게
            int idx = i; // idx 는 배열에서 가장 작은 값을 가진 배열의 index 를 저장
            for (int j = i + 1; j < n; j++) {
                if(arr[j]<arr[idx]) idx = j;
            }
            int tmp = arr[i]; // arr[i] 값과 arr[idx] 값을 교환
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
}
