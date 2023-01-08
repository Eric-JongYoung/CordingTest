package inflearn.step04.ch03_매출액의종류;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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
        for (int x : T.solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
    /**
     * HashMap, Two Pointer, Sliding Window
     */
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // int[] 를 HashMap 에 넣기
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // HashMap 에서 Sliding Window 로 하고나서 ArrayList 에 넣기
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if(map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;
        }
        return answer;
    }
}

