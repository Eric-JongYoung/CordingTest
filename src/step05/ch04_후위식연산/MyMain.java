package step05.ch04_후위식연산;


import java.util.Scanner;
import java.util.Stack;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                switch (x) {
                    case '+':
                        stack.push(lt + rt);
                        break;
                    case '-':
                        stack.push(lt - rt);
                        break;
                    case '*':
                        stack.push(lt * rt);
                        break;
                    case '/':
                        stack.push(lt / rt);
                        break;
                }
            }


        }

        answer = stack.get(0);
        return answer;
    }
}
