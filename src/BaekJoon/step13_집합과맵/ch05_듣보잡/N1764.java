package BaekJoon.step13_집합과맵.ch05_듣보잡;

import java.util.*;

public class N1764 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        String[] a = new String[n];
        String[] b = new String[m];
        for (int i = 0; i < n; i++) {
            a[i] = kb.next();
        }
        for (int i = 0; i < m; i++) {
            b[i] = kb.next();
        }
        for (String x : solution(a, b)) {
            System.out.println(x);
        }
    }
    public static ArrayList<String> solution(String[] a , String [] b) {
        ArrayList<String> answer = new ArrayList<>();
        HashMap<String, Integer> mapA = new HashMap<>();
        for (String x : a) {
            mapA.put(x, mapA.getOrDefault(x, 0) + 1);
        }
        for (String x : b) {
            mapA.put(x, mapA.getOrDefault(x, 0) -1);
        }
        int cnt = 0;
        for (String key : mapA.keySet()) {
            if (mapA.get(key) == 0) {
                answer.add(key);
                cnt++;
            }
        }
        answer.add(String.valueOf(cnt));
        Collections.sort(answer);
        return answer;
    }
}
