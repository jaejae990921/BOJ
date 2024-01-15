import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max += arr[i + 1] - arr[i];
            } else {
                max = 0;
            }

            sum = Math.max(sum, max);
        }

        sb.append(sum);

        System.out.println(sb);
    }
}