import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int three = 0;

        int N = Integer.parseInt(br.readLine());

        int answer = N * (N + 1) / 2;

        sb.append(answer + "\n");
        sb.append((int) Math.pow(answer, 2) + "\n");

        for (int i = 1; i <= N; i++) {
            three += (int) Math.pow(i, 3);
        }

        sb.append(three);

        System.out.println(sb);
    }
}