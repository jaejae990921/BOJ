import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int small, big;

        int[] arr = new int[10];
        int[] prefixSum = new int[11];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }

        for (int j = 0; j < prefixSum.length; j++) {
            if (prefixSum[j] == 100) {
                sb.append(prefixSum[j]);
                break;
            } else if (prefixSum[j] > 100) {
                small = prefixSum[j - 1];
                big = prefixSum[j];

                if (big - 100 <= 100 - small) {
                    sb.append(big);
                } else {
                    sb.append(small);
                }
                break;
            }
        }

        if (sb.length() == 0) {
            sb.append(prefixSum[10]);
        }

        System.out.println(sb);
    }
}