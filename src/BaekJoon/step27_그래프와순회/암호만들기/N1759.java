package BaekJoon.step27_그래프와순회.암호만들기;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N1759 {
    static int L, C;
    static char[] list;
    static char[] code;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //  입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        list = new char[C]; // 입력 가능한 알파벳 저장
        code = new char[L]; // 코드로 사용할 알파벳 저장

        //  list 에 입력 가능한 알파벳 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            list[i] = st.nextToken().charAt(0);
        }
        // 알파벳 정렬
        Arrays.sort(list);

        backTracking(0, 0); // 조합 시작
        br.close();
    }

    public static void backTracking(int cnt, int start) {
        if (start == L) {
            if (checkTheCode()) { // 조건에 맞을 경우에만 출력
                System.out.println(code);
            }
            return;
        } else {
            for (int i = cnt; i < C; i++) {
                code[start] = list[i];
                backTracking(i + 1, start + 1);
            }
        }
    }

    /***
     * 최소 한개의 모음, 최소 2개의 자음인지 확인
     * @return : 해당 code 가 문제 조건에 맞으면 true, 만약 틀리면 false
     */
    public static boolean checkTheCode() {
        int vowel = 0;
        int consonant = 0;
        for (char x : code) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                vowel++;
            } else {
                consonant++;
            }
        }
        if (vowel >= 1 && consonant >= 2) {
            return true;
        }
        return false;
    }

}
