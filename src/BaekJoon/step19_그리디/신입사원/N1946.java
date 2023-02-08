package BaekJoon.step19_그리디.신입사원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class N1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        ArrayList<Candidate> arr;
        StringTokenizer st;
        for (int i = 0; i < tc; i++) {
            int N = Integer.parseInt(br.readLine());
            arr = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                int rankA = Integer.parseInt(st.nextToken());
                int rankB = Integer.parseInt(st.nextToken());
                arr.add(new Candidate(rankA, rankB));
            }
            System.out.println(solution(arr, N));
        }
        br.close();
    }

    public static int solution(ArrayList<Candidate> arr, int N) {
        int cnt = 0;
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        for (Candidate ob : arr) {
            if (ob.rankB < min) {
                min = ob.rankB;
                cnt++;
            }
        }
        return cnt;
    }
}

class Candidate implements Comparable<Candidate> {
    int rankA;
    int rankB;

    public Candidate(int rankA, int rankB) {
        this.rankA = rankA;
        this.rankB = rankB;
    }

    @Override
    public int compareTo(Candidate o) {
        // rankA기준으로 오름차순
        return this.rankA - o.rankA;
    }
}

