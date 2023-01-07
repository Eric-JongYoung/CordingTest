package step04.ch02_아나그램_해쉬;

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

    /**
     * HashMap 을 기존 값으로 만들고 나서
     * 비교 대상의 키 값을 하나씩 제거 해서
     * 둘이 동일 한지 판별한다.
     */
    public String solution(String a, String b) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : b.toCharArray()) {
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x, map.get(x) - 1);
        }
        return answer;
    }
}
