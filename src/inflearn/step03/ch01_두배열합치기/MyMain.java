package inflearn.step03.ch01_두배열합치기;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        for(int x : T.solution(a,b)){
            System.out.print(x+ " ");
        }
    }

    public ArrayList<Integer> solution(int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0 ; i < a.length ; i++){
            answer.add(a[i]);
        }
        for(int i = 0 ; i < b.length ; i++){
            answer.add(b[i]);
        }
        answer.sort(Comparator.naturalOrder());

        return answer;
    }
}
