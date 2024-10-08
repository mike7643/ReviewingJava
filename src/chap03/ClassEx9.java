package chap03;

public class ClassEx9 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                res+=i;
            }
        }
        System.out.println("res = " + res);
    }
}
