import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long num = 0, x = 0, y = 0, sum = 0;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            num = Long.parseLong(st.nextToken());
            pq.add(num);
        }

        for (int j = 0; j < m; j++) {
            x = pq.poll();
            y = pq.poll();
            pq.add(x + y);
            pq.add(x + y);
        }

        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        sb.append(sum);
        System.out.print(sb);
    }
}