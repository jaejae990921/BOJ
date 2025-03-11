import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int c, n, max, temp;
        int[] cArr;

        int K = Integer.parseInt(br.readLine());

        for (int i = 1; i <= K; i++) {
            st = new StringTokenizer(br.readLine());

            c = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            cArr = new int[c + 1];
            max = -1;

            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= c; j++) {
                cArr[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());

            for (int k = 0; k < n; k++) {
                temp = Integer.parseInt(st.nextToken());

                cArr[temp]--;
            }

            for (int l = 1; l <= c; l++) {
                if (cArr[l] > max) {
                    max = cArr[l];
                }
            }

            sb.append("Data Set ").append(i).append(":\n").append(max).append("\n\n");

        }

        System.out.println(sb);
    }
}