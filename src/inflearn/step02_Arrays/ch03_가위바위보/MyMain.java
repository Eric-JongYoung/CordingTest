package inflearn.step02_Arrays.ch03_가위바위보;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arryA = new int[n];
        int[] arryB = new int[n];

        for(int i = 0; i <n ; i++){
            arryA[i] = kb.nextInt();
        }
        for(int i = 0; i <n ; i++){
            arryB[i] = kb.nextInt();
        }

        for(char x : T.solution(arryA,arryB).toCharArray()){
            System.out.println(x);
        }
    }
    public String solution(int[] arryA, int[] arryB){
        String answer = "";
        for(int i = 0 ; i < arryA.length; i++){
            if (arryA[i] == arryB[i]) answer += "D";
            else if (arryA[i] == 1 && arryB[i] == 3) answer += "A";
            else if (arryA[i] == 2 && arryB[i] == 1) answer += "A";
            else if (arryA[i] == 3 && arryB[i] == 2) answer += "A";
            else answer += "B";
        }
        return answer;
    }
}
