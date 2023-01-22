package BaekJoon.step07_기본수학1.ch08_큰수AB;

import java.math.BigInteger;
import java.util.Scanner;

public class N10757 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        BigInteger a = new BigInteger(kb.next());
        BigInteger b = new BigInteger(kb.next());
        a = a.add(b);
        System.out.println(a);
    }
}
