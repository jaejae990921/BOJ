import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] prime;
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        prime = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            if (prime[i] == true) {
                continue;
            }

            for (int j = i; j <= N; j += i) {
                if (prime[j] == false) {
                    prime[j] = true;
                    cnt++;
                    if (cnt == K) {
                        sb.append(j);
                        break;
                    }
                }
            }
        }

        System.out.println(sb);
    }
}