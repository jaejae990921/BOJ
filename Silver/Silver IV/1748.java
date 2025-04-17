import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        int cnt = 0, add = 1, div = 10;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            if (i % div == 0) {
                add++;
                div *= 10;
            }

            cnt += add;
        }
        
        sb.append(cnt);
		System.out.println(sb);
	}
}