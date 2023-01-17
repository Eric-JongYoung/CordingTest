package BaekJoon.step05_함수.ch03_한수;

import java.util.Scanner;

public class N1065 {

    public static void main(String[] args) {
        N1065 T = new N1065();
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
    public int solution(int n) {
        int answer = 0;
        if(n<100){
            answer = n;
        }else if(n==1000) {
            answer = 144;
        }
        else {
            int[] arr = new int[3];
            int cnt = 0;
            answer = 99;
            for (int i = 101; i <= n; i++) {
                int k = i;
                while (true){
                    arr[cnt] = (k%10);
                    cnt++;
                    if(k<10){
                        cnt=0;
                        break;
                    }
                    k=k/10;
                }
                if((arr[2]-arr[1])==(arr[1]-arr[0])) answer++;
            }
        }
        return answer;
    }
}
