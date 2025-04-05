import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int left = 0, right = 0, mid = 0;
        long budget = 0;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        right = arr[N - 1];

        while (left <= right) {
            mid = (left + right) / 2;
            budget = 0;

            for (int j = 0; j < N; j++) {
                if (arr[j] > mid) {
                    budget += mid;
                } else {
                    budget += arr[j];
                }
            }

            if (budget <= M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        sb.append(right);
        System.out.println(sb);
    }
}