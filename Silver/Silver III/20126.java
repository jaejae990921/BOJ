import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int x, y, temp, answer = -1;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            arr[i][0] = x;
            arr[i][1] = y;
        }

        Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);

        temp = arr[0][0] - M;

        if (temp > -1) {
            answer = 0;
        } else {
            for (int i = 0; i < N - 1; i++) {
                temp = arr[i + 1][0] - arr[i][0] - arr[i][1] - M;

                if (temp > -1) {
                    answer = arr[i][0] + arr[i][1];
                    break;
                }
            }

            if (answer == -1) {
                temp = S - arr[N - 1][0] - arr[N - 1][1] - M;

                if (temp > -1) {
                    answer = arr[N - 1][0] + arr[N - 1][1];
                }
            }
        }

        sb.append(answer);
        System.out.print(sb);
    }
}