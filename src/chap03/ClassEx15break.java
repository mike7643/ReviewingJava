package chap03;

public class ClassEx15break {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if(j==3)
//                    break; 와 continue 비교
                    continue;
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
