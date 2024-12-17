import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N, num, min, max;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                num = Integer.parseInt(st.nextToken());
                
                if (num > max) {
                    max = num;
                }

                if (num < min) {
                    min = num;
                }
            }

            sb.append(min + " " + max).append("\n");
        }
        
		System.out.println(sb);
	}
}
