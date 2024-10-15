package chap04midtermTest.class241015;

import java.util.Arrays;

public class Project7 {
    public static void main(String[] args) {
        int[][] s4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < s4.length; i++) {
            for (int j = 0; j < s4[i].length; j++) {
//                System.out.print(s4[i][j]+" ");
                System.out.println(Arrays.toString(s4));
            }
        }
    }
}