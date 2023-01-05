package step02.ch02_보이는학생;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
    public int solution(int n, int[] arr){
        int answer = 1;
        int max = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i]>max){
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
}
