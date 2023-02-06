package BaekJoon.step10_정렬.ch11_나이순정렬;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class N10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Information> arr = new ArrayList<>();
        StringTokenizer st ;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            int time = i;
            arr.add(new Information(age, name, time));
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(arr); // 얘가 밑에 있는 compareTo 로 정렬
        for (Information o : arr) {
            sb.append(o.age + " " + o.name);
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();

    }

}

class Information implements Comparable<Information>{
    public int age;
    public String name;
    public int time;

    public Information(int age, String name, int time) {
        this.age = age;
        this.name = name;
        this.time = time;
    }

    @Override
    public int compareTo(Information o) {
        if(this.age==o.age) return this.time - o.time; //나이가 같다면, 가입순으로
        else return this.age - o.age; // 기본적으로 나이순으로 정렬
    }
}