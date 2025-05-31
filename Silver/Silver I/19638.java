import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        for (int j = 0; j < T; j++) {
            if ((pq.peek() < H) || (pq.peek() == 1)) {
                break;
            } else {
                cnt++;
                pq.add(pq.poll() / 2);
            }
        }

        boolean flag = H > pq.peek();

        if (flag) {
            sb.append("YES").append("\n").append(cnt);
        } else {
            sb.append("NO").append("\n").append(pq.peek());
        }

        System.out.print(sb);
    }
}