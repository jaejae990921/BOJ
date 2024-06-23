import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";

        while ((str = br.readLine()) != null) {
            if (str.equals(".")) {
                break;
            }

            sb.append(func(str)).append("\n");
        }

        System.out.println(sb);
    }

    public static String func(String str) {
        Stack<Character> stack = new Stack<Character>();
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    flag = false;
                } else {
                    stack.pop();
                }
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    flag = false;
                } else {
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) {
            flag = false;
        }

        return flag ? "yes" : "no";
    }
}