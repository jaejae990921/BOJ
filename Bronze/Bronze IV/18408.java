import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = 0, oneCnt = 0, twoCnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                oneCnt++;
            } else {
                twoCnt++;
            }
        }

        if (oneCnt > twoCnt) {
            sb.append("1");
        } else {
            sb.append("2");
        }

        System.out.println(sb);
    }
}