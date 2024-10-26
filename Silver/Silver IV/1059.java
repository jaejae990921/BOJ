import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        int A = 0, B = 1000, temp, cnt = 0;

        int L = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < L; i++) {
            temp = Integer.parseInt(st.nextToken());

            if (temp == n) {
                flag = true;
                break;
            }

            if (temp < n && A < temp)
                A = temp;

            if (temp > n && B > temp)
                B = temp;
        }

        if (flag) {
            sb.append(0);
        } else {
            for (int j = A + 1; j <= n; j++) {
                for (int k = n; k < B; k++) {
                    cnt++;
                }
            }

            sb.append(cnt - 1);
        }

        System.out.println(sb);
    }
}