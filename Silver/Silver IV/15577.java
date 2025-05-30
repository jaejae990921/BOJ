import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Double> pq = new PriorityQueue<>();
        double input = 0.0, first = 0.0, second = 0.0, avg = 0.0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            input = Double.parseDouble(br.readLine());
            pq.add(input);
        }

        while (pq.size() > 1) {
            first = pq.poll();
            second = pq.poll();
            avg = (first + second) / 2.0;
            pq.add(avg);
        }

        sb.append(String.format("%.6f", pq.poll()));
        System.out.print(sb);
    }
}