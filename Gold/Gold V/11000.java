import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static class Study implements Comparable<Study> {
        int start, end;

        public Study(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Study c) {
            if (this.start == c.start) {
                return this.end - c.end;
            }

            return this.start - c.start;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int S, T;

        int N = Integer.parseInt(br.readLine());
        Study[] studies = new Study[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            S = Integer.parseInt(st.nextToken());
            T = Integer.parseInt(st.nextToken());

            studies[i] = new Study(S, T);
        }

        Arrays.sort(studies);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(studies[0].end);

        for (int i = 1; i < N; i++) {
            if (pq.peek() <= studies[i].start) {
                pq.poll();
            }

            pq.add(studies[i].end);
        }

        sb.append(pq.size());
        System.out.println(sb);
    }
}