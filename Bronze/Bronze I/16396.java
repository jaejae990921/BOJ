import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[10001];
        int start, end, cnt = 0;
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            for (int j = start; j < end; j++) {
                arr[j] = true;
            }
        }

        for (int j = 0; j < 10001; j++) {
            if (arr[j]) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}