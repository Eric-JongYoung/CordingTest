package BaekJoon.step20_스텍.균형잡힌세상;

import java.io.*;
import java.util.Stack;

public class N4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder sb = new StringBuilder();
        String str;

        while (true) {
            str = br.readLine();

            if (str.equals(".")) {
                break;
            }
            sb.append(solution(str)).append('\n');
        }
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if (tmp == '(' || tmp == '[') {
                stack.push(tmp);
            } else if (tmp == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                }else {
                    stack.pop();
                }
            } else if (tmp == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                }else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return "yes";
        }else {
            return "no";
        }
    }
}
