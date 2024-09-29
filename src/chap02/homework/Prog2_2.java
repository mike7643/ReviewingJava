package chap02.homework;

import java.util.Scanner;

public class Prog2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("마일을 입력하시오 : ");

        double mile = sc.nextDouble();

        double km = mile * 1.609;

        System.out.println(mile+"마일은 "+km+"킬로미터입니다.");
    }
}
