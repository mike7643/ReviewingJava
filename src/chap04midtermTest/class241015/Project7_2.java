package chap04midtermTest.class241015;

import java.util.Arrays;

public class Project7_2 {
    public static void main(String[] args) {
        int[][] ragged = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9}};
        for (int i = 0; i < ragged.length; i++) {
            for (int j = 0; j < ragged[i].length; j++) {
                System.out.print(ragged[i][j]+" ");
                System.out.println(Arrays.toString(ragged));
            }
        }
    }
}