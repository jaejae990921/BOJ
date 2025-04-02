import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double answer = 0.0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = K; i <= M; i++) {
            answer += combination(M, i) * combination(N - M, M - i);
        }

        answer /= combination(N, M);

        sb.append(answer);
        System.out.println(sb);
    }

    public static double combination(int n, int r) {
        double result = 1;

        for (int i = 0; i < r; i++) {
            result *= (double) (n - i) / (i + 1);
        }

        return result;
    }
}