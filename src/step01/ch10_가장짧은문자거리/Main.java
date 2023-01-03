package step01.ch10_가장짧은문자거리;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char t = kb.next().charAt(0);

        for(int x : T.solution(s,t)){
            System.out.print(x + " ");
        }
    }

    public int[] solution(String s, char t){
        int[] answer = new int[s.length()];

        int p = 100;
        for(int i = 0 ; i<s.length(); i++){
            if(s.charAt(i)==t) {
                p = 0;
                answer[i] = p;
            }else {
                p++;
                answer[i] = p;
            }
        }
        p = 100;
        for(int i = s.length()-1; i >=0 ; i--){
            if(s.charAt(i)==t){
                p = 0;
            }else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }
}
