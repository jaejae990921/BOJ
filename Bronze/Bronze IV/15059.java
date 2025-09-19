import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int sum = 0;

        int[] a = new int[3];
        int[] b = new int[3];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int j = 0; j < 3; j++) {
            b[j] = Integer.parseInt(st.nextToken());
        }

        for (int k = 0; k < 3; k++) {
            if (b[k] - a[k] > 0) {
                sum += b[k] - a[k];
            }
        }

        sb.append(sum);
        System.out.println(sb);
    }
}