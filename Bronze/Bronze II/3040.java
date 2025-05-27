import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for (int j = 0; j < 8; j++) {
            for (int k = j + 1; k < 9; k++) {
                if (sum - arr[j] - arr[k] == 100) {
                    arr[j] = 0;
                    arr[k] = 0;
                    break;
                }
            }

            if (arr[j] == 0) {
                break;
            }
        }

        for (int l = 0; l < 9; l++) {
            if (arr[l] != 0) {
                sb.append(arr[l]).append("\n");
            }
        }

        System.out.print(sb);
    }
}