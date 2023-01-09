package inflearn.step04_HashMap_TreeSet.ch05_k번째큰수;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
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
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());  //내림차순으로 하려구
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : Tset) {
            cnt++;
            if (cnt == k) return x;
        }

        // TreeSet 연습
        Tset.remove(143); // value 값이 143 인걸 지움
        Tset.size(); // 원소의 갯수
        Tset.first(); // 오름차순이면 최소값 - 내림차순이면 최댓값
        Tset.last(); // 오름차순이면 최대값 - 내림차순이면 최소값

        return answer;
    }
}


