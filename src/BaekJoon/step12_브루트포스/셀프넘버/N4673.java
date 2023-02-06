package BaekJoon.step12_브루트포스.셀프넘버;

public class N4673 {
    public static void main(String[] args) {
        int max = 10001;

        boolean[] check = new boolean[max];

        for (int i = 1; i < max; i++) {
            int n = checkSelfNum(i);

            if (n < max) {
                check[n] = true;
            }
        }

        for (int i = 1; i < max; i++) {
            if(!check[i]){
                System.out.println(i);
            }
        }

    }

    public static int checkSelfNum(int num) {
        int sum = num;

        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}
