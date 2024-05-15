import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), ",");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < K; j++) {
            for (int l = 0; l < N - 1; l++) {
                arr[l] = arr[l + 1] - arr[l];
            }
        }

        for (int m = 0; m < N - K; m++) {
            sb.append(arr[m]);

            if (m != N - K - 1) {
                sb.append(",");
            }
        }

        System.out.println(sb);
    }
}
