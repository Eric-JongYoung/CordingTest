package BaekJoon.step20.ch01_스택;

import java.util.Scanner;

public class N10828 {
    public static int[] arr;
    public static int size = 0;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = kb.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            String str = kb.next();
            switch (str){
                case "push": push(kb.nextInt()); break;
                case "pop": sb.append(pop()).append('\n'); break;
                case "size": sb.append(size()).append('\n'); break;
                case "empty": sb.append(empty()).append('\n'); break;
                case "top": sb.append(top()).append('\n'); break;
            }
        }
        System.out.println(sb);
    }


    public static void push(int num) {
        arr[size] = num;
        size++;
    }
    public static int pop(){
        if(size==0){
            return -1;
        }else {
            int res = arr[size - 1];
            arr[size - 1] = 0;
            size--;
            return res;
        }
    }
    public static int size(){
        return size;
    }
    public static int empty() {
        if(size == 0) return 1;
        else return 0;
    }
    public static int top(){
        if(size==0) return -1;
        else return arr[size - 1];
    }
}
