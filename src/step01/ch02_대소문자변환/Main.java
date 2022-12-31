package step01.ch02_대소문자변환;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        /*
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            }else {
                answer += Character.toLowerCase(x);
            }
        }*/
        /**
         * ASCII 를 이용해보자.
         * */
        for (char x : str.toCharArray()){
            //소문자냐?
            if(x>=97 && x<=122){
                //소문자를 대문자로
                answer += (char)(x - 32);
            }else {
                answer += (char)(x + 32);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

}


/**
 *설명
 *
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 *
 * 예시
 * StuDY -> sTUdy
 * */