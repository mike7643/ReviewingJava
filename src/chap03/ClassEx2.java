package chap03;

import java.util.Scanner;

public class ClassEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.print("학점 : ");
        if (i >= 90)
            System.out.print("A");
        else if (i >= 80)
            System.out.println("B");
        else
            System.out.println("C");
    }
}
