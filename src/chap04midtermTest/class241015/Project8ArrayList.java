package chap04midtermTest.class241015;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project8ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list= new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < 3; i++) {
            Integer a = list.get(i);
            System.out.print(a);
        }
    }
}
