package BaekJoon.step20_스텍.ch03_괄호;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class N9012 {
    public static void main(String[] args) {
        N9012 T = new N9012();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.next();
        }

        for (String x : T.solution(n, arr)) {
            System.out.println(x);
        }
    }

    public ArrayList<String> solution(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : arr){
            answer.add(cal(x));
        }
        return answer;
    }
    public String cal(String str){
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
