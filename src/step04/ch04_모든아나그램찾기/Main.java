package step04.ch04_모든아나그램찾기;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a, b));
    }

    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        // b 값을 나눠서 HashMap 에 넣기
        for (char x : b.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }
        // a 값을 나눠서 HashMap 에 넣기
        int len = b.length() - 1;
        for (int i = 0; i < len; i++) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }
        // sliding window 로 값을 비교하기
        int lt = 0;
        for (int rt = len; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
            if(am.equals(bm)) answer++;

            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
            if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
            lt++;
        }

        return answer;
    }
}
