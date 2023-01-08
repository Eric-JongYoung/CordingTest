package BaekJoon.step20_스텍.후위표기식;

import java.util.Scanner;
import java.util.Stack;

public class N1918 {
    public static void main(String[] args) {
        N1918 T = new N1918();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isAlphabetic(x)) {
                answer += x;
            } else if (x == '(') {
                stack.push(x);
            } else if (x == ')') {
                while (!stack.isEmpty()) {
                    char tmp = stack.pop();
                    if (tmp == '(') break;
                    answer += tmp;
                }
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(x)) {
                    answer += stack.pop();
                }
                stack.push(x);
            }
        }
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        return answer;
    }
    /**
     * 연산기호의 우선순위를 정하는 method
     * */
    public int precedence(char x) {
        if (x == '(') return 0;
        if (x == '+' || x == '-') return 1;
        else return 2;
    }
}
