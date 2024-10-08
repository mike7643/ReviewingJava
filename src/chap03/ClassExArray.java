package chap03;

public class ClassExArray {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i : arr) {
            System.out.print(i); //모든 요소는 0으로 초기화된다.
        }
    }
}
