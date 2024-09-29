package chap02.homework;

import java.util.Scanner;

public class Prog2_1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("오렌지 개수 입력 : ");

        int a = sc.nextInt();
        int b = 10;

        int box = a / b;
        int least = a % b;

        if(a<10)
            System.out.println("1박스가 필요.");
        else
            System.out.println(box+"박스가 필요, " +least+"개가 남음.");
    }
}
