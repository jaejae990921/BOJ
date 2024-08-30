import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int idx = 0;

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        sb.append("<");

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        while (N > 0) {
            idx = (idx + K - 1) % N;
            sb.append(arr[idx]).append(", ");
            for (int i = idx; i < N - 1; i++) {
                arr[i] = arr[i + 1];
            }
            N--;
        }

        sb.setLength(sb.length() - 2);
        sb.append(">");
        System.out.println(sb);
    }
}