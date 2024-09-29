package chap02.homework;

import java.awt.*;
import java.util.Scanner;

public class Prog2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("드라이브 이름: ");
        String a = sc.next();
        System.out.print("디렉터리 이름: ");
        String b = sc.next();
        System.out.print("파일 이름: ");
        String c = sc.next();
        System.out.print("확장자: ");
        String d = sc.next();

        System.out.println("완전한 이름은 "+a+b+c+d);
    }
}
