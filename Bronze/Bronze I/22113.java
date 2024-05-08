import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0, S, E;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] bus = new int[M];
        int[][] fee = new int[N][N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            bus[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < N; j++) {
            st = new StringTokenizer(br.readLine());

            for (int k = 0; k < N; k++) {
                fee[j][k] = Integer.parseInt(st.nextToken());
            }
        }

        for (int l = 0; l < M - 1; l++) {
            S = bus[l] - 1;
            E = bus[l + 1] - 1;
            sum += fee[S][E];
        }

        sb.append(sum);
        System.out.println(sb);
    }
}