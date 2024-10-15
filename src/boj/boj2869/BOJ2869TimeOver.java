package boj.boj2869;

import java.util.Scanner;

class BOJ2869TimeOver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int allDayMeter = 0;
        int dayCount=0;

        while(v!=allDayMeter){
            dayCount++;
            allDayMeter+=a;
            if (allDayMeter >= v) {
                break;
            }
            allDayMeter-=b;
        }

        System.out.println(dayCount);
    }
}