package RealCordingTest.Zum.Q3;




public class Main {
    public static void main(String[] args) {
        Main T = new Main();

//        int[] arr = {2, 2, 2, 3};
        int[] arr = {6, 5, 7 ,3, 4, 2};
        System.out.println(T.solution(arr));
    }
    public int solution(int[] arr){
        int answer = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 2; j < arr.length; j++) {
                sum = (j - i-1) * (Math.min(arr[i], arr[j]));
                answer = Math.max(answer, sum);
            }
        }
        return answer;
    }
}

