import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        int time, cnt = 0;
		
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] arr = new int[C + 1];

        for (int i = 0; i < N; i++) {
            time = Integer.parseInt(br.readLine());
            
            for (int j = 1; j <= C; j++) {
                if (j % time == 0) {
                    arr[j] = 1;
                }
            }
        }

        for (int k = 1; k <= C; k++) {
            if (arr[k] == 1) {
                cnt++;
            }
        }

        sb.append(cnt);
		System.out.println(sb);
	}
}
