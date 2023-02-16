package BaekJoon.step21_큐_덱.덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class N10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");

            switch (str[0]) {
                case "push_front" :{
                    deque.addFirst(Integer.valueOf(str[1]));
                    break;
                }
                case "push_back" :{
                    deque.addLast(Integer.valueOf(str[1]));
                    break;
                }
                case "pop_front" :{
                    if(deque.isEmpty()) System.out.println(-1);
                    else {
                        System.out.println(deque.pollFirst());
                    }
                    break;
                }
                case "pop_back" :{
                    if(deque.isEmpty()) System.out.println(-1);
                    else {
                        System.out.println(deque.pollLast());
                    }
                    break;
                }
                case "size" :{
                    int size = deque.size();
                    System.out.println(size);
                    break;
                }
                case "empty" :{
                    if(deque.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                }
                case "front" :{
                    if(deque.isEmpty()) System.out.println(-1);
                    else {
                        Integer tmp = deque.peekFirst();
                        System.out.println(tmp);
                    }
                    break;
                }
                case "back" :{
                    if(deque.isEmpty()) System.out.println(-1);
                    else {
                        Integer tmp = deque.peekLast();
                        System.out.println(tmp);
                    }
                    break;
                }
                default: break;
            }
        }


        br.close();
    }
}
