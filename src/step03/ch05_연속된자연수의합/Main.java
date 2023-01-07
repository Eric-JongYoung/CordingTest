package step03.ch05_연속된자연수의합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
        System.out.println(T.solution2(n));
    }
    /**
     * 방법1)
     * 연속된 자연수의 합인데, ch04에서 이용했던 연속부분수열 처럼 전부다 할 수 도 있지만,
     * 자연수의 합이라는 것 자체가 n/2 밑의 값들의 합으로만 하면 됨.
     * 왜냐하면 그 이상 더해 봤자, n 보다 무조건 큰 수가 나오기 때문에
     */
    public int solution(int n) {
        int answer = 0, sum = 0 , lt = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i+1;
        }
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if(sum==n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if(sum==n) answer++;
            }
        }
        return answer;
    }

    /***
     * 방법2) 수학적인 방법 - n 숫자를 나눈뒤에 그 값을 나뉜 값에 숫자를 넣어서
     * 딱 나뉘어 떨어지면 연속된 자연수의 합으로 할 수 있다.
     * cnt : 연속된 자연수의 갯수
     */
    public int solution2(int n) {
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if(n%cnt==0) answer++;
        }
        return answer;
    }
}
