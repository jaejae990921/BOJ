import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] arr = new int[] { A, B, C };
        Arrays.sort(arr);

        if (arr[0] + arr[1] > arr[2]) {
            sb.append(A + B + C);
        } else {
            sb.append((arr[0] + arr[1]) * 2 - 1);
        }

        System.out.println(sb);
    }
}