package BaekJoon.step20_스텍.쇠막대기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class N10799 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
        br.close();
    }

    public static int solution(String str) {
        int answer =0;
        Stack<Character> stack = new Stack<>();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            }else {
                stack.pop();
                if (str.charAt(i - 1) == '(') { // 레이져 일때
                    answer += stack.size();
                }else { // 막대기 끝일때
                    answer++;
                }
            }
        }
        return answer;
    }
}
