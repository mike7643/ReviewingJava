package boj;

import java.util.*;

class BOJ2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int now = 1;
        while (n > count) {
            count += now * 6;
            now++;
        }
        System.out.println(now);
    }
}
/*
        result=check(n);
        System.out.print(result);
    }
    private static int check(int n){
        if(n==1){
            return 1;
        }
        int a = n/6;
        return a;
    }*/
