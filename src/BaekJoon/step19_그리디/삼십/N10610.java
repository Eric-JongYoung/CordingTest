package BaekJoon.step19_그리디.삼십;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String numStr = br.readLine();
        int sum = 0;

        // 숫자 재배치
        char[] charArr = numStr.toCharArray();
        Arrays.sort(charArr); // 오름차순 정렬
        int len = charArr.length;
        StringBuilder sb = new StringBuilder();

        // 오름차순 정렬 이므로, 맨 끝 원소 부터 반대로 검색
        // 3의 배수 이려면, 모든 자리수의 합이 3의 배수 이여야함.
        for (int i = len - 1; i >= 0; i--) {
            int num = charArr[i] - '0'; // int 로 변환
            sum += num;
            sb.append(num);
        }

        // 30의 배수인지 판단
        if (charArr[0] != '0' || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sb);

        br.close();
    }
}
/**
 * 1) 주어진 숫자를 오름차순 정렬하기
 *   -> 내림차순 정렬이 필요하지만, 간단하게 오름차순 정렬 후 반대로 for문 수행하면 된다.
 * 2)  맨 끝 원소부터 0번 인덱스(첫 번째 원소) 까지 for문 탐색
 * 3)  각 원소를 전부 더하기
 * 4)  각 원소를 전부 더한 값이 3의 배수이고, 가장 첫 번째 원소(0번 인덱스) 의 값이 0이면 정답
 *   ->  두 조건 중 하나라도 만족하지 않으면 30의 배수가 아님.
 * */