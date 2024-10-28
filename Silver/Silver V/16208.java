import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long sum = 0, answer = 0;

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            sum += arr[i];
        }

        Arrays.sort(arr);

        for (int j = 0; j < n - 1; j++) {
            sum -= arr[j];
            answer += sum * arr[j];
        }

        sb.append(answer);
        System.out.println(sb);
    }
}