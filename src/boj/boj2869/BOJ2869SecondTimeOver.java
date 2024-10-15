package boj.boj2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ2869SecondTimeOver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

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