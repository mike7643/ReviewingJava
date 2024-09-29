package chap02;

import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하세요 : ");
        int i = sc.nextInt();

        int a = i / 60;
        int b = i % 60;

        System.out.println(i+"는 "+a+"분 "+b+"초 입니다.");

        int j = 0;
        int d = (j>18) ? 1 : 2;
        System.out.println("d = " + d);
    }
}
