import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int R = 0, C;

        String str = br.readLine();
        int N = str.length();

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                R = Math.max(R, i);
            }
        }

        C = N / R;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sb.append(str.charAt(j * R + i));
            }
        }

        System.out.println(sb);
    }
}