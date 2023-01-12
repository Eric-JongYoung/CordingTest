package RealCordingTest.Crema.Exam.Q3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class New {


    public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());


        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        System.out.println();
        bw.write(String.valueOf(T.solution(n,arr,k)));

        bw.flush();
        bw.close();
        br.close();
    }


    public int solution(int n, int[] arr, int k) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            list.clear();
            int sum = 0;

            for(int j=0; j<n; j++) {
                if((i & (1<<j)) != 0) {
                    list.add(arr[j]);
                }
            }
            for (int f = 0; f < list.size(); f++) {
                sum += list.get(f);
            }
            if (sum <= k) {
                max = list.size();
                answer = Math.max(answer, max);
            }
        }

        return answer;
    }


}
