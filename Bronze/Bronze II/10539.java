import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        int N = Integer.parseInt(br.readLine());
        int[] arrB = new int[N];
        int[] arrA = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        sum += arrB[0];
        arrA[0] = sum;

        for (int i = 1; i < N; i++) {
            arrA[i] = arrB[i] * (i + 1) - sum;
            sum += arrA[i];
        }

        for (int num : arrA) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}