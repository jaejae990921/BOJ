import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int diff;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (arr[1] - arr[0] == arr[2] - arr[1]) {
            diff = arr[1] - arr[0];
            sb.append(arr[N - 1] + diff);
        } else {
            diff = arr[1] / arr[0];
            sb.append(arr[N - 1] * diff);
        }

        System.out.println(sb);
    }
}