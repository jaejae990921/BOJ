import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.io.IOException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int Dasom = Integer.parseInt(br.readLine());
        int cnt = 0;

        if (N != 1) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < N - 1; i++) {
                pq.add(Integer.parseInt(br.readLine()));
            }

            while (Dasom <= pq.peek()) {
                int max = pq.poll();
                pq.add(max - 1);
                Dasom++;
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}