import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue pq = new PriorityQueue(Collections.reverseOrder());
        int x;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (pq.isEmpty()) {
                    sb.append(0 + "\n");
                } else {
                    sb.append(pq.poll() + "\n");
                }
            } else {
                pq.add(x);
            }
        }

        System.out.println(sb);
    }
}