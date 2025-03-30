import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static class ballon {
        int idx;
        int move;

        public ballon(int idx, int move) {
            this.idx = idx;
            this.move = move;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<ballon> deque = new ArrayDeque<>();
        ballon temp = null;
        int idx = 0, move = 0;

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            move = Integer.parseInt(st.nextToken());
            deque.add(new ballon(i, move));
        }

        while (!deque.isEmpty()) {
            temp = deque.pollFirst();

            idx = temp.idx;
            move = temp.move;

            sb.append(idx).append(" ");

            if (deque.isEmpty()) {
                break;
            }

            if (move > 0) {
                for (int i = 1; i < move; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 1; i <= Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb);
    }
}