package BaekJoon.step20_스텍.문자열폭발;

import java.io.*;
import java.util.Stack;

public class N9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String bomb = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));

            if (stack.size() >= bomb.length()) {
                boolean contain = true;
                for (int j = 0; j < bomb.length(); j++) {
                    if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
                        contain = false;
                        break;
                    }
                }
                if (contain) {
                    for (int j = 0; j < bomb.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character x : stack) {
            sb.append(x);
        }
        bw.write(sb.length() == 0 ? "FRULA" : sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

}
