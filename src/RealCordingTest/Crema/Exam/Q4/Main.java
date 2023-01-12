package RealCordingTest.Crema.Exam.Q4;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.next();
        }
        System.out.println(T.solution(arr));

    }


    public static int solution (String[] arr){
        int answer = Integer.MIN_VALUE;
        for (String x : arr) {
            int len = x.length();
            if (len > answer) { // 최대값이 발견되면 단어 교체 해주는 로직
                answer = len;
            }
        }
        return answer;
    }

}
