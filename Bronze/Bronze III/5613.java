import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char op;

        int num = Integer.parseInt(br.readLine());

        while (true) {
            op = br.readLine().charAt(0);

            switch (op) {
                case '+':
                    num += Integer.parseInt(br.readLine());
                    break;
                case '-':
                    num -= Integer.parseInt(br.readLine());
                    break;
                case '*':
                    num *= Integer.parseInt(br.readLine());
                    break;
                case '/':
                    num /= Integer.parseInt(br.readLine());
                    break;
            }

            if (op == '=') {
                sb.append(num);
                break;
            }
        }

        System.out.println(sb);
    }
}
