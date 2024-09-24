import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());
        String password = br.readLine();
        int len = password.length();
        int M = len / K;

        char[][] arr = new char[M][K];

        int idx = 0;

        for (int i = 0; i < M; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < K; j++) {
                    arr[i][j] = password.charAt(idx++);
                }
            } else {
                for (int j = K - 1; j >= 0; j--) {
                    arr[i][j] = password.charAt(idx++);
                }
            }
        }

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(arr[j][i]);
            }
        }

        System.out.println(sb);
    }
}