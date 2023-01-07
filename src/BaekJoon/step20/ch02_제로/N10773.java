package BaekJoon.step20.ch02_제로;

import java.util.Scanner;
import java.util.Stack;

public class N10773 {
    public static void main(String[] args) {
        N10773 T = new N10773();
        Scanner kb = new Scanner(System.in);
        int k = kb.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(k, arr));
    }

    public int solution(int k, int[] arr) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            if (arr[i] == 0) {
                stack.pop();
            }else {
                stack.push(arr[i]);

            }
        }
        for (int x : stack) {
            answer += x;
        }

        return answer;
    }
}
