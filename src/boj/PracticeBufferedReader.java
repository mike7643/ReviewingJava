package boj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PracticeBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        /*readLine()을 사용하면 라인 단위로 값을 받아오기 때문에,
        split 이나 StringTokenizer 등을 이용, 파싱해서 사용해야 한다.*/


        /*split 을 이용한 Parsing */
        String[] stringArray = s.split(" ");
        for (String string : stringArray) {
            System.out.println(string);
        }

        /*StringTokenizer 를 이용한 Parsing*/
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
