import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        int answer = 0;
        
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                for (int k = 1; k < N + 1; k++) {
                    if (i + j + k == N && i >= j + 2 && k % 2 == 0) {
                        answer++;
                    }
                }
            }
        }

        sb.append(answer);
        System.out.println(answer);
	}
}
