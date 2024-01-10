import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int bird = 1;
        int cnt = 0;

        while (N > 0) {
            if (N < bird) {
                bird = 1;
            }

            N -= bird;
            bird++;
            cnt++;
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}