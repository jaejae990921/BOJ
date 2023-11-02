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
			int num = 0;
			
			String[] strArr = br.readLine().split(" ");
			command = strArr[0];
			if (strArr.length == 2) {
				num = Integer.parseInt(strArr[1]);
			}

			switch (command) {
				case "push":
					stack.add(num);
					break;
				case "pop":
					if (stack.size() == 0) {
						sb.append("-1\n");
					} else {
						sb.append(stack.get(stack.size() - 1) + "\n");
						stack.remove(stack.size() - 1);
					}
					break;
				case "size":
					sb.append(stack.size() + "\n");
					break;
				case "empty":
					if (stack.size() == 0) {
						sb.append("1\n");
					} else {
						sb.append("0\n");
					}
					break;
				case "top":
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