import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int cnt = 0;

        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < M; j++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        for (int a : A) {
            if (!B.contains(a)) {
                cnt++;
            }
        }

        for (int b : B) {
            if (!A.contains(b)) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}