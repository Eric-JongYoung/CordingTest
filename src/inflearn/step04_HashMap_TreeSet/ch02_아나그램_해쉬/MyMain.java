package inflearn.step04_HashMap_TreeSet.ch02_아나그램_해쉬;

import java.util.HashMap;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a, b));
    }

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
