package BaekJoon.step10_정렬.ch10_단어정렬;


import java.io.*;
import java.util.*;

public class N1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });
        System.out.println(arr[0]);
        for (int i = 1; i < N; i++) {
            if (!arr[i-1].equals(arr[i])) {
                System.out.println(arr[i]);
            }
        }
        br.close();
    }

}

