package step05.ch01_올바른괄호;

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
     * Stack 을 이용한 문제 풀이
     * 여는 괄호는 push 로 넣고, 닫는 괄호 나오면 pop 으로 꺼냄.
     */
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if(x=='(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }
}
