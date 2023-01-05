package step02.ch04_피보나치수열;

import java.util.ArrayList;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for(int x : T.solution(n)){
            System.out.print(x+ " ");
        }
    }
    public ArrayList<Integer> solution(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        int tmp = 1;
        for(int i = 1 ; i <n ; i++){
            arr.add(tmp);
            tmp = arr.get(i-1) + arr.get(i);
        }
        return arr;
    }
}
