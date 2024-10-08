package chap03;

import java.util.Scanner;

public class ClassEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char grade;
        int i = sc.nextInt();

        int num = i / 10;
        grade = switch (num) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
        System.out.println("학점: " + grade);
    }
}
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char grade;
        int i = sc.nextInt();

        int num = i / 10;
        switch(num) {
            case 10:
            case 9:
                grade='A';
                break;
            case 8:
                grade='B';
                break;
            case 7:
                grade='C';
                break;
            case 6:
                grade='D';
                break;
            default:
                grade='F';
        }
        System.out.println("학점: "+grade);
*/
