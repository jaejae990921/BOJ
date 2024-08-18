import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0, start = 1, end;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        end = M;

        int j = Integer.parseInt(br.readLine());
        int[] apple = new int[j];

        for (int i = 0; i < j; i++) {
            apple[i] = Integer.parseInt(br.readLine());
        }

        for (int k = 0; k < j; k++) {
            if (apple[k] < start) {
                cnt += start - apple[k];
                start = apple[k];
                end = apple[k] + M - 1;
            } else if (apple[k] > end) {
                cnt += apple[k] - end;
                end = apple[k];
                start = apple[k] - M + 1;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}