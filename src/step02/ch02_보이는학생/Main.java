package step02.ch02_보이는학생;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }

    public int solution(int n, int[] arr){
        int anwser = 1;
        int max = arr[0];

        for(int i = 1 ; i < n ; i++){
            if(arr[i]>max){
                anwser++;
                max = arr[i];
            }
        }
        return anwser;
    }
}
