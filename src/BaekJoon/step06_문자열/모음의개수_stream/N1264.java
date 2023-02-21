package BaekJoon.step06_문자열.모음의개수_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class N1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String str = br.readLine();
            if(str.charAt(0)=='#') break;
            System.out.println(sol(str));
        }
        br.close();
    }
    public static long sol(String str){
        char[] tmp = str.toUpperCase().toCharArray();
        String vowels = "AEIOU";
        return IntStream.range(0, tmp.length)
                .mapToObj(i -> tmp[i])
                .filter(c -> vowels.indexOf(c) != -1)
                .count();
    }
}
