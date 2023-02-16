package BaekJoon.step21_큐_덱.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class N10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> Q = new LinkedList<>();
        int last = 0 ;
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");

            switch (str[0]) {
                case "push" :{
                    last = Integer.parseInt(str[1]);
                    Q.add(last);
                    break;
                }
                case "pop" :{
                    if(Q.isEmpty()) System.out.println(-1);
                    else {
                        System.out.println(Q.poll());
                    }
                    break;
                }
                case "size" :{
                    int size = Q.size();
                    System.out.println(size);
                    break;
                }
                case "empty" :{
                    if(Q.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                }
                case "front" :{
                    if(Q.isEmpty()) System.out.println(-1);
                    else {
                        Integer tmp = Q.peek();
                        System.out.println(tmp);
                    }
                    break;
                }
                case "back" :{
                    if(Q.isEmpty()) System.out.println(-1);
                    else {
                        System.out.println(last);
                    }
                    break;
                }
                default: break;
            }
        }


        br.close();
    }
}
