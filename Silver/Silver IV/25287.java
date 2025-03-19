import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String answer = "";
        int[] arr;
        int N, prev, temp, a, b;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N];

            answer = "YES";

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            prev = -1;

            for (int k = 0; k < N; k++) {
                a = arr[k];
                b = N - a + 1;

                if (a > b) {
                    temp = a;
                    a = b;
                    b = temp;
                }

                if (prev <= a) {
                    prev = a;
                } else if (prev <= b) {
                    prev = b;
                } else {
                    answer = "NO";
                    break;
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }
}