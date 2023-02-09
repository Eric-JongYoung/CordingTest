package BaekJoon.step19_그리디.보석도둑;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N1202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Jewel[] arr = new Jewel[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            arr[i]=new Jewel(weight, value);
        }
        Arrays.sort(arr, new Comparator<Jewel>() {
            // 무게 순으로 오름차순 정렬, 만약 무게가 같다면 value 를 기준으로 내림차순
            @Override
            public int compare(Jewel o1, Jewel o2) {
                if (o1.weight == o2.weight) {
                    return o2.value - o1.value;
                }
                return o1.weight - o2.weight;
            }
        });

        int[] bagSize = new int[k];
        for (int i = 0; i < k; i++) {
            bagSize[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bagSize);
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0, j = 0; i < k; i++) {

            while (j < n && arr[j].weight <= bagSize[i]) {
                pq.offer(arr[j++].value);
            }
            if (!pq.isEmpty()) {
                answer += pq.poll();
            }
        }

        System.out.println(answer);

        br.close();
    }
}

class Jewel {
    int weight;
    int value;

    public Jewel(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}
