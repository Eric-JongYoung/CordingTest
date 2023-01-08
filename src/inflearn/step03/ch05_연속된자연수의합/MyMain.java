package inflearn.step03.ch05_연속된자연수의합;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

    public int solution(int n) {
        int answer = 0, sum = 0 , lt = 0;
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum==n){
                answer++;
            }
            while (sum > n) {
                sum -= arr[lt++];
                if(sum==n) answer++;
            }
        }
        return answer;
    }
}
