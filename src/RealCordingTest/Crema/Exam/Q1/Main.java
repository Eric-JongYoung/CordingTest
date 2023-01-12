package RealCordingTest.Crema.Exam.Q1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = str;

        answer = str.replaceAll("AWS","");

        if (answer.equals("")) {
            answer = "-1";
        } else if (answer.contains("AWS")) {
            solution(answer);
        }
        answer = answer.replaceAll("AWS","");
        if (answer.equals("")) {
            answer = "-1";
        }
        return answer;
    }
}

