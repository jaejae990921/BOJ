import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long sum = 0;

        int n = Integer.parseInt(br.readLine());
        int[] distance = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                sum += Math.abs(distance[j] - distance[k]);
            }
        }

        sb.append(sum);
        System.out.println(sb);
    }
}