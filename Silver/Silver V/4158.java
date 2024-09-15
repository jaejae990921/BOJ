import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();
        StringTokenizer st;
        int N, M, cnt = 0;

        while (true) {
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            if (N == 0 && M == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {
                set.add(Integer.parseInt(br.readLine()));
            }

            for (int i = 0; i < M; i++) {
                if (set.contains(Integer.parseInt(br.readLine()))) {
                    cnt++;
                }
            }

            sb.append(cnt).append('\n');
            cnt = 0;
            set.clear();
        }

        System.out.println(sb);
    }
}