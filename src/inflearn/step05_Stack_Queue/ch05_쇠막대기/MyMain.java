package inflearn.step05_Stack_Queue.ch05_쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
    /**
     * 막대기의 끝 인가
     * 레이저의 끝인가 구분해서 정리.
     * */
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (str.charAt(i - 1) == '(') {
                    answer += stack.size();
                }else{
                    answer++;
                }
            }
        }
        return answer;
    }
}
