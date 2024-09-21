import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int rank = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        if (N == 0) {
            sb.append(1);
            System.out.println(sb);
            return;
        }

        int[] scores = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        if (N == P && scores[N - 1] >= score) {
            sb.append(-1);
        } else {
            for (int i = 0; i < N; i++) {
                if (scores[i] > score) {
                    rank++;
                }
            }
            sb.append(rank);
        }

        System.out.println(sb);
    }
}