import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		int back = 0;

		for (int i = 0; i < N; i++) {
			String[] op = br.readLine().split(" ");

			switch (op[0]) {
				case "push":
					queue.offer(Integer.parseInt(op[1]));
					back = Integer.parseInt(op[1]);
					break;
				case "pop":
					if (queue.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(queue.poll()).append("\n");
					}
					break;
				case "size":
					sb.append(queue.size()).append("\n");
					break;
				case "empty":
					if (queue.isEmpty()) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
					break;
				case "front":
					if (queue.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(queue.peek()).append("\n");
					}
					break;
				case "back":
					if (queue.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(back).append("\n");
					}
					break;
			}
		}

		System.out.println(sb);
	}
}