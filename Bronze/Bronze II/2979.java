import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[101];

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j < end; j++) {
                arr[j]++;
            }
        }

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (arr[i] == 1) {
                sum += A;
            } else if (arr[i] == 2) {
                sum += B * 2;
            } else if (arr[i] == 3) {
                sum += C * 3;
            }
        }

        sb.append(sum);
        System.out.println(sb);
    }
}