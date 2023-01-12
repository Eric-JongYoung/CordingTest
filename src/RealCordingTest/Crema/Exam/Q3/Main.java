package RealCordingTest.Crema.Exam.Q3;

import java.util.ArrayList;
import java.util.List;
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
        int k = kb.nextInt();

        System.out.println(T.solution(n,arr,k));
    }


    public int solution(int n, int[] arr, int k) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            list.clear();
            int sum = 0;

            for(int j=0; j<n; j++) {
                if((i & (1<<j)) != 0) {
                    list.add(arr[j]);
                }
            }
            for (int f = 0; f < list.size(); f++) {
                sum += list.get(f);
            }
            if (sum <= k) {
                max = list.size();
                answer = Math.max(answer, max);
            }
        }

        return answer;
    }


}
