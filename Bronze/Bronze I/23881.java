import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0, max, maxIdx = 0, temp;

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < N - 1; j++) {
            max = 0;

            for (int k = 0; k < N - j; k++) {
                if (max < arr[k]) {
                    max = arr[k];
                    maxIdx = k;
                }
            }

            if (maxIdx == N - j - 1) {
                continue;
            } else {
                temp = arr[N - j - 1];
                arr[N - j - 1] = arr[maxIdx];
                arr[maxIdx] = temp;

                if (++cnt == K) {
                    sb.append(arr[maxIdx] + " " + arr[N - j - 1]);
                    break;
                }
            }
        }

        if (cnt < K) {
            sb.append("-1");
        }

        System.out.println(sb);
    }
}