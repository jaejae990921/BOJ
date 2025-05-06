import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        boolean isStop = false;
        char ch = ' ';
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());
        String skill = br.readLine();

        for (int i = 0; i < N; i++) {
            ch = skill.charAt(i);

            if (isStop) {
                break;
            }

            if (String.valueOf(ch).matches("[1-9]")) {
                cnt++;
            } else {
                switch (ch) {
                    case 'L':
                        stack.push(String.valueOf(cnt));
                        break;
                    case 'R':
                        if (!stack.isEmpty()) {
                            stack.pop();
                            cnt++;
                        } else {
                            isStop = true;
                        }
                        break;
                    case 'S':
                        stack2.push(String.valueOf(cnt));
                        break;
                    case 'K':
                        if (!stack2.isEmpty()) {
                            stack2.pop();
                            cnt++;
                        } else {
                            isStop = true;
                        }
                        break;
                }
            }
        }

        sb.append(cnt);
        System.out.print(sb);
    }
}