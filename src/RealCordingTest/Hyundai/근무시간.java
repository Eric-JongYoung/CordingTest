package RealCordingTest.Hyundai;

import java.util.Scanner;

public class 근무시간 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String time;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            time = kb.nextLine();
            String[] str = time.split(" ");
            String[] split = str[0].split(":");
            String[] split2 = str[1].split(":");
            int end = Integer.parseInt(split2[0]) * 60 + Integer.parseInt(split2[1]);
            int start = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
            arr[i] = end - start;
        }
        int answer = 0;
        for (int x : arr) {
            answer += x;
        }
        System.out.println(answer);
    }
}
