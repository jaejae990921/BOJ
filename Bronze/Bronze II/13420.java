import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        long a, b, answer;
        String op, eq;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            a = Long.parseLong(st.nextToken());
            op = st.nextToken();
            b = Long.parseLong(st.nextToken());
            eq = st.nextToken();
            answer = Long.parseLong(st.nextToken());

            switch (op) {
                case "+":
                    if (a + b == answer) {
                        sb.append("correct\n");
                    } else {
                        sb.append("wrong answer\n");
                    }
                    break;
                case "-":
                    if (a - b == answer) {
                        sb.append("correct\n");
                    } else {
                        sb.append("wrong answer\n");
                    }
                    break;
                case "*":
                    if (a * b == answer) {
                        sb.append("correct\n");
                    } else {
                        sb.append("wrong answer\n");
                    }
                    break;
                case "/":
                    if (b != 0 && a / b == answer && a % b == 0) {
                        sb.append("correct\n");
                    } else {
                        sb.append("wrong answer\n");
                    }
                    break;
            }
        }

        System.out.print(sb);
    }
}