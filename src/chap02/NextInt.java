package chap02;

import java.io.IOException;
import java.util.Scanner;

public class NextInt {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in); // -> System.in 스트림 객체

        int x, y, sum;

        System.out.print("첫번째 : ");
        x =sc.nextInt();

        System.out.print("두번째 : ");
        y = sc.nextInt();

        sc.close();

        sum = x +y;

        System.out.println("sum = " + sum);
    }
}
