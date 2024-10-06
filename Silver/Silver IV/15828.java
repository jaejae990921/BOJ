import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<String> queue = new LinkedList<>();
        String input;

        int N = Integer.parseInt(br.readLine());

        while (!(input = br.readLine()).equals("-1")) {
            if (input.equals("0")) {
                queue.poll();
            } else {
                if (queue.size() < N) {
                    queue.offer(input);
                }
            }
        }

        if (queue.isEmpty()) {
            sb.append("empty");
        } else {
            while (!queue.isEmpty()) {
                sb.append(queue.poll()).append(" ");
            }
        }

        System.out.println(sb);
    }
}