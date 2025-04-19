import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer = -1;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int j = N - 3; j >= 0; j--) {
            if (arr[j] + arr[j + 1] > arr[j + 2]) {
                answer = arr[j] + arr[j + 1] + arr[j + 2];
                break;
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }
}