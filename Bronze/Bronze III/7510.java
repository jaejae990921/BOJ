import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arr = new int[3];

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 3; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            sb.append("Scenario #").append(i).append(":\n");

            Arrays.sort(arr);

            if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
                sb.append("yes\n\n");
            } else {
                sb.append("no\n\n");
            }
        }

        System.out.println(sb);
    }
}