package chap03;

import java.util.Scanner;

public class ClassEx1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        if (i % 2 == 0) {
            System.out.println("짝수입니다.");
        }else
            System.out.println("홀수입니다.");
        sc.close();
    }
}
