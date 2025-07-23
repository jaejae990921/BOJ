import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            arr = br.readLine().split(" ");

            sb.append("Case #").append(i).append(": ");

            for (int j = arr.length - 1; j >= 0; j--) {
                if (j == arr.length - 1) {
                    sb.append(arr[j]);
                } else {
                    sb.append(" ").append(arr[j]);
                }
            }

            if (i < N) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}