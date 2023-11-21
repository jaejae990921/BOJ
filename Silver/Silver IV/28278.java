import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> stack = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			String command;
			
			String[] strArr = br.readLine().split(" ");
			command = strArr[0];

			switch (command) {
				case "1":
					stack.add(Integer.parseInt(strArr[1]));
					break;
				case "2":
					if (stack.size() == 0) {
						sb.append("-1\n");
					} else {
						sb.append(stack.get(stack.size() - 1) + "\n");
						stack.remove(stack.size() - 1);
					}
					break;
				case "3":
					sb.append(stack.size() + "\n");
					break;
				case "4":
					if (stack.size() == 0) {
						sb.append("1\n");
					} else {
						sb.append("0\n");
					}
					break;
				case "5":
					if (stack.size() == 0) {
						sb.append("-1\n");
					} else {
						sb.append(stack.get(stack.size() - 1) + "\n");
					}
					break;
			}
		}
		
		System.out.println(sb);
	}
}