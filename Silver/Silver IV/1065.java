import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0, a, b, c;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                cnt++;
            } else {
                a = i / 100;
                b = (i % 100) / 10;
                c = i % 10;

                if (a - b == b - c) {
                    cnt++;
                }
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}