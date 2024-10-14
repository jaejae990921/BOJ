import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int j = 1; j <= arr[0]; j++) {
            cnt = 0;

            for (int k = 0; k < n; k++) {
                if (arr[k] % j == 0) {
                    cnt++;
                }
            }

            if (cnt == n) {
                sb.append(j).append("\n");
            }
        }

        System.out.println(sb);
    }
}