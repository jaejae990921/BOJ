import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "Nice";

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int[] line = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            line[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = N - 1; i >= 0; i--) {
            stack.push(line[i]);
        }

        int num = 1;

        while (num <= N) {
            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                num++;
            } else if (!temp.isEmpty() && temp.peek() == num) {
                temp.pop();
                num++;
            } else {
                if (stack.isEmpty()) {
                    answer = "Sad";
                    break;
                }

                temp.push(stack.pop());
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }
}