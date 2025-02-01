import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int height = 0, mid = 0, prev = 0;
        boolean flag = false;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] x = new int[M];

        for (int i = 0; i < M; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }

        int left = 1;
        int right = N;

        while (left <= right) {
            mid = (left + right) / 2;
            flag = true;
            prev = 0;

            for (int i = 0; i < M; i++) {
                if (x[i] - mid <= prev) {
                    prev = x[i] + mid;
                } else {
                    flag = false;
                    break;
                }
            }

            if (N - prev > 0) {
                flag = false;
            }

            if (flag) {
                height = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        sb.append(height);
        System.out.println(sb);
    }
}