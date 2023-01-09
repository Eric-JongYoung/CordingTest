package inflearn.step02_Arrays.ch07_점수계산;

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
        System.out.println(T.solution(n,arr));
    }

    public int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]==1){
                cnt++;
                answer += cnt;
            }else {
                cnt = 0;
            }
        }
        return answer;
    }
}
