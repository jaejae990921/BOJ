import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<String> deque = new ArrayDeque<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String op = st.nextToken();

			switch (op) {
				case "push_front":
					deque.offerFirst(st.nextToken());
					break;
				case "push_back":
					deque.offerLast(st.nextToken());
					break;
				case "pop_front":
					if (deque.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(deque.pollFirst()).append("\n");
					}
					break;
				case "pop_back":
					if (deque.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(deque.pollLast()).append("\n");
					}
					break;
				case "size":
					sb.append(deque.size()).append("\n");
					break;
				case "empty":
					sb.append(deque.isEmpty() ? 1 : 0).append("\n");
					break;
				case "front":
					sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
					break;
				case "back":
					sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
					break;
			}
		}

		System.out.println(sb);
	}
}