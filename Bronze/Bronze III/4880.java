import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int one, two, three;

        while (true) {
            st = new StringTokenizer(br.readLine());
            one = Integer.parseInt(st.nextToken());
            two = Integer.parseInt(st.nextToken());
            three = Integer.parseInt(st.nextToken());

            if (one == 0 && two == 0 && three == 0) {
                break;
            }

            if (two - one == three - two) {
                sb.append("AP ").append(three + (three - two)).append("\n");
            } else {
                sb.append("GP ").append(three * (three / two)).append("\n");
            }
        }

        System.out.println(sb);
    }
}