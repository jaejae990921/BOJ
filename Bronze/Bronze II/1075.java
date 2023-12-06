import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        N = N / 100 * 100;

        while (true) {
            if (N % F == 0) {
                break;
            }
            N++;
        }

        if (N % 100 < 10) {
            sb.append("0");
        }

        sb.append(N % 100);
        System.out.println(sb);
	}
}