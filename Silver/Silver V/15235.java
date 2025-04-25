import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<int[]> queue = new LinkedList<>();
        int time = 0, minus = 0;
        int[] temp;

        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            queue.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
        }

        while (!queue.isEmpty()) {
            time++;
            temp = queue.poll();
            minus = temp[1] - 1;

            if (minus == 0) {
                answer[temp[0]] = time;
            } else {
                queue.offer(new int[] { temp[0], minus });
            }
        }

        for (int j = 0; j < N; j++) {
            sb.append(answer[j]).append(" ");
        }

        System.out.println(sb);
    }
}