import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "X";
        int n;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if ((k - a) % d == 0) {
            n = (k - a) / d + 1;
            if (n >= 1) {
                answer = String.valueOf(n);
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }
}