import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0, day = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        while (true) {
            day += T;

            if (day > N) {
                break;
            }

            sum += C * P;
        }

        sb.append(sum);
        System.out.println(sb);
    }
}