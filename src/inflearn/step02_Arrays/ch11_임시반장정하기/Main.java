package inflearn.step02_Arrays.ch11_임시반장정하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n + 1][6];
        // i가 학생 번호
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }

    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for(int k = 1 ; k <= 5 ; k++){ // k는 학년
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break; // 한번만 카운트 해야하므로 break 로 벗어나야함.
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
}
/***
 * 기본적으로 1~5학년으로 그냥 0은 제외하고 1부터 시작한다고 생각하고 배열 만듦.
 * 학생도 1번 부터 있다고 가정하고 만듦.
 */