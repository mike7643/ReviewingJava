package chap02;

import java.util.Scanner;

public class NextLineAndNext {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int i = sc.nextInt();
        System.out.println(i * 10 + "입니다.");

        String a = sc.next();
        System.out.println("a = " + a);


        String b = sc.nextLine();
        System.out.println("b = " + b);

    }
}
