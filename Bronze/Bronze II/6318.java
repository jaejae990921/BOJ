import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String input = "";
        int n = 0, sum = 0, avg = 0, cnt = 0, idx = 1;
        int[] arr;

        while ((input = br.readLine()) != null) {
            if (input.equals("0")) {
                break;
            }

            n = Integer.parseInt(input);
            arr = new int[n];
            sum = 0;

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            avg = sum / n;
            cnt = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] > avg) {
                    cnt += arr[j] - avg;
                }
            }

            sb.append("Set #").append(idx).append("\n");
            sb.append("The minimum number of moves is ").append(cnt).append(".\n\n");
            idx++;
        }

        System.out.println(sb);
    }
}