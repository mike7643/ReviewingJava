package chap04midtermTest.class241015;

import java.util.Arrays;

public class Project7_3 {
    public static void main(String[] args) {
        int[][] ragged = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9}};

        for (int[] ints : ragged) {
            for (int anInt : ints) {
                System.out.print(anInt);
                }
        }
    }
}

