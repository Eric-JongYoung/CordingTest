package RealCordingTest.Crema.Exam.Q2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {


    public void solution(int num) {
        int[] arr = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> max = new ArrayList<>();
        ArrayList<Integer> min = new ArrayList<>();


        if (arr[0] != 9) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[0] == arr[i]) {
                    max.add(9);
                } else {
                    max.add(arr[i]);
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[1] == arr[i]) {
                    max.add(9);
                } else {
                    max.add(arr[i]);
                }
            }
        }

        if (arr[0] != 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[0] == arr[i]) {
                    min.add(1);
                } else {
                    min.add(arr[i]);
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                    min.add(1);
            }
        }

        String anw = "";
        for (int x : max) {
            anw += String.valueOf(x);
        }
        String anw2 = "";
        for (int x : min) {
            anw2 += String.valueOf(x);
        }


        int k = Integer.parseInt(anw) - Integer.parseInt(anw2);
        System.out.println(k);

    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.solution(n);
    }
}
