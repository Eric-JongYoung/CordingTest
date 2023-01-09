package inflearn.step04_HashMap_TreeSet.ch01_학급회장_해쉬;

import java.util.HashMap;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }

    public char solution(int n ,String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1); // 처음에 값이 없으면 디폴트로 0을 넣어주고 시작
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        // 이건 HashMap 사용법 설명
        System.out.println(map.containsKey('A')); // 해당 값 있는지 유무를 boolean 으로 표현
        System.out.println(map.size()); // 사이즈
        System.out.println(map.remove('A')); // 해당 key 값을 삭제함.
        return answer;
    }
}
/**
 *
 * 해쉬맵
 * key : Character 이고 value 는 Integer 로
 */
