package RealCordingTest.Crema.PreView;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        for (String x : T.solution(n, arr)) {
            System.out.println(x);
        }
    }

    public ArrayList<String> solution(int n, int[] arr) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (arr[i] % 3 == 0) {
                answer.add("Fizz");
            } else if (arr[i] % 5 == 0) {
                answer.add("Buzz");
            }else {
                answer.add(String.valueOf(arr[i]));
            }
        }
        return answer;
    }
}
