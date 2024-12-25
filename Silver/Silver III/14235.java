import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st;
        String input;
        int tmp;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            input = br.readLine();

            if (input.equals("0")) {
                if (pq.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(pq.poll() + "\n");
                }
            } else {
                st = new StringTokenizer(input);
                tmp = Integer.parseInt(st.nextToken());

                for (int j = 0; j < tmp; j++) {
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }
        }

        System.out.println(sb);
    }
}