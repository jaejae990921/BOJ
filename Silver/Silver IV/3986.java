import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        String str;
        char ch;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = br.readLine();

            if (str.length() % 2 == 1) {
                continue;
            }

            stack.push(str.charAt(0));

            for (int j = 1; j < str.length(); j++) {
                ch = str.charAt(j);

                if (stack.size() > 0 && stack.peek() == ch) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }

            if (stack.isEmpty()) {
                cnt++;
            } else {
                stack.clear();
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}