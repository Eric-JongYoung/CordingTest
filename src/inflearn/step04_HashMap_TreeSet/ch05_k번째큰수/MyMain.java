package inflearn.step04_HashMap_TreeSet.ch05_k번째큰수;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
    /**
     * TreeSet 이용하기 - 중복 제거하면서 정렬까지 됨.
     */
    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> map = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int s = j + 1; s < n; s++) {
                    map.add(arr[i] + arr[j] + arr[s]);
                }
            }
        }
        int cnt = 0;
        for (int x : map) {
            cnt++;
            if(cnt == k ) return x;
        }
        return answer;
    }
}


