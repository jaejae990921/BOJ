import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer = 0;

        int N = Integer.parseInt(br.readLine());

        answer = N * N / 2;

        if (N == 1) {
            answer = 0;
        } else if (N % 2 == 1) {
            answer += 1;
        }

        sb.append(answer);
        System.out.println(sb);
    }
}