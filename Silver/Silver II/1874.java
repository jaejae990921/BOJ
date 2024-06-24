import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int start = 0;

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int value = Integer.parseInt(br.readLine());

            if (value > start) {
                for (int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append("+\n");
                }
                start = value;
            } else if (stack.peek() != value) {
                sb.setLength(0);
                sb.append("NO\n");
                System.out.println(sb);
                return;
            }

            stack.pop();
            sb.append("-\n");
        }

        System.out.println(sb);
    }
}