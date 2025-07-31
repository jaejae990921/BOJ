import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int input, output;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int max = m;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            input = Integer.parseInt(st.nextToken());
            output = Integer.parseInt(st.nextToken());

            m += input;
            m -= output;

            max = Math.max(max, m);

            if (m < 0) {
                max = 0;
                break;
            }
        }

        sb.append(max);
        System.out.println(sb);
    }
}