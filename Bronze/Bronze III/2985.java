import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] op = { '+', '-', '*', '/' };

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 4; i++) {
            if (calc(a, b, op[i]) == c) {
                sb.append(a).append(op[i]).append(b).append('=').append(c);
                break;
            }
            if (calc(b, c, op[i]) == a) {
                sb.append(a).append('=').append(b).append(op[i]).append(c);
                break;
            }
        }

        System.out.println(sb);
    }

    public static int calc(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return 0;
    }
}