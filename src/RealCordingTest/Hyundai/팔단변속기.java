package RealCordingTest.Hyundai;

import java.io.*;


public class 팔단변속기 {
    static int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
    static int[] dsc = {8, 7, 6, 5, 4, 3, 2, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        if (compare(arr, asc)) {
            System.out.println("ascending");
        } else if (compare(arr, dsc)) {
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }

        br.close();
    }
    public static boolean compare(int[] arr1, int[] arr2) {
        for (int i = 0; i < 8; i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
