import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 25;

        int[] prefixSum = new int[80001];
        prefixSum[10] = 25;

        for (int i = 11; i <= 80000; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                sum += i;
            }

            prefixSum[i] = sum;
        }

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int j = 0; j < T; j++) {
            sb.append(prefixSum[Integer.parseInt(st.nextToken())]).append("\n");
        }

        System.out.println(sb);
    }
}