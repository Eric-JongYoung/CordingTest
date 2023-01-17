package BaekJoon.step07_기본수학1.ch01_손익분기점;

import java.util.Scanner;

public class N1712 {
    public static void main(String[] args) {
        N1712 T = new N1712();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        System.out.println(T.solution(a, b, c));
    }

    public int solution(int a, int b, int c){
        int answer = -1;
        if(b>=c){
            return answer;
        }else {
            int price = c - b;
            answer = a / price +1;
        }
        return answer;
    }
}
