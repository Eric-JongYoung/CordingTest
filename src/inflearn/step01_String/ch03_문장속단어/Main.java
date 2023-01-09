package inflearn.step01_String.ch03_문장속단어;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));

    }

    public String solution(String str) {
        String anwser = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" "); // split 이용
        for (String x : s) {
            int len = x.length();
            if (len > m) { // 최대값이 발견되면 단어 교체 해주는 로직
                m = len;
                anwser = x;
            }
        }
        return anwser;
    }

    public String solution2(String str){
        String anwser = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos=str.indexOf(' '))!= -1) { // indexOf 이용 해서 -> 띄어쓰기를 발견하면 -1 을 리턴함

            String tmp = str.substring(0, pos); // 0 부터 pos 전까지.
            int len = tmp.length();
            if (len > m) { // 같다로 하면 안됨 -> 뒤쪽 단어가 변경 되어 버림.
                m = len;
                anwser = tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length()>m){ // 마지막 단어 처리
            anwser = str;
        }
        return anwser;
    }
}

/**
 * 설명
 *
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 *
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
 *
 * */