import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        String op;
        int num;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            op = st.nextToken();

            switch (op) {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    num = queue.isEmpty() ? -1 : queue.poll();
                    sb.append(num).append('\n');
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    num = queue.isEmpty() ? 1 : 0;
                    sb.append(num).append('\n');
                    break;
                case "front":
                    num = queue.isEmpty() ? -1 : queue.peek();
                    sb.append(num).append('\n');
                    break;
                case "back":
                    num = queue.isEmpty() ? -1 : ((LinkedList<Integer>) queue).getLast();
                    sb.append(num).append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }
}