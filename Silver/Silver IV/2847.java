import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0, temp;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int j = arr.length - 1; j > 0; j--) {
            if (arr[j] <= arr[j - 1]) {
                temp = arr[j - 1];
                arr[j - 1] = arr[j] - 1;
                cnt += temp - arr[j - 1];
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}