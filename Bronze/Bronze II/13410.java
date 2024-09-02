import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num, reverse;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];

        for (int i = 1; i <= K; i++) {
            num = N * i;

            reverse = 0;

            while (num != 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }

            arr[i - 1] = reverse;
        }

        Arrays.sort(arr);

        sb.append(arr[K - 1]);
        System.out.println(sb);
    }
}