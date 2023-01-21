package BaekJoon.step23_이분탐색.Gold01_냅색문제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class N1450 {
    static int n,c ;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        c = kb.nextInt();
        // 0. 입력 및 초기화
        ArrayList<Integer> weight1 = new ArrayList<>();
        ArrayList<Integer> weight2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(i < n/2) weight1.add(kb.nextInt());
            else weight2.add(kb.nextInt());
        }

        ArrayList<Integer> sum1 = new ArrayList<>();
        ArrayList<Integer> sum2 = new ArrayList<>();

        dfs(0,0,weight1,sum1);
        dfs(0,0,weight2,sum2);

        Collections.sort(sum2);
        int answer = 0 ;
        for (int i = 0; i < sum1.size(); i++) {
            int searchValue = c - sum1.get(i);
            answer += binarySearch(sum2, searchValue) + 1;
        }
        System.out.println(answer);

    }
    public static void dfs(int idx, int sum, ArrayList<Integer> weight, ArrayList<Integer> answer){
        if(sum>c) return;
        if (idx == weight.size()) {
            answer.add(sum);
            return;
        }
        // 1. 물건 넣기
        dfs(idx + 1, sum + weight.get(idx), weight, answer);
        // 2. 물건 안넣기
        dfs(idx + 1, sum , weight, answer);
    }
    public static int binarySearch(ArrayList<Integer> sum, int target) {
        int left = 0 , right = sum.size() -1, mid, answer = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (sum.get(mid) <= target) {
                answer = mid;
                left = mid +1;
            }
            else right = mid - 1;
        }
        return answer;
    }
}
