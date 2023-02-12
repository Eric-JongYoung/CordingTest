package BaekJoon.대회.KSA컵_winter_2023.B_그래서대회이름뭐로하죠;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {
    static int N, M;
    static char[] arr;
    static char[] name;
    static boolean flag = false;
    static String answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        String str = br.readLine();

        if (!str.contains("A")) {
            System.out.println("NO");
        } else {
            if (N == M) {
                if (check(str)) {
                    System.out.println("YES");
                    System.out.println(str);
                } else {
                    System.out.println("NO");
                }
            } else if (N > M) {
                arr = str.toCharArray();
                name = new char[M];
                dfs(0, 0);
                if (!flag) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    System.out.println(answer);
                }
            }
        }
        br.close();
    }

    public static boolean check(String str) {
        char[] chars = str.toCharArray();
        char x = chars[str.length() - 1];
        char y = chars[str.length() - 2];
        char z = chars[str.length() - 3];
        if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
            return false;
        } else if (y != 'A' || z != 'A') {
            return false;
        }else {
            return true;
        }
    }

    public static void dfs(int cnt, int start) {
        if (start == M) {
            if (check(String.valueOf(name))) { // 조건에 맞을 경우에만 출력
                flag = true;
                answer = String.valueOf(name);
                return;
            }
        } else {
            for (int i = cnt; i < N; i++) {
                name[start] = arr[i];
                dfs(i + 1, start + 1);
            }
        }
    }
}
