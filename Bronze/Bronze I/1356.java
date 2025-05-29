import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "NO";
        int front = 0, end = 0;

        String input = br.readLine();
        int len = input.length();

        for (int i = 1; i < len; i++) {
            front = getSum(input.substring(0, i));
            end = getSum(input.substring(i, len));

            if (front == end) {
                answer = "YES";
                break;
            }
        }

        sb.append(answer);
        System.out.print(sb);
    }

    public static int getSum(String input) {
        int sum = 1;

        for (int i = 0; i < input.length(); i++) {
            sum *= (input.charAt(i) - '0');
        }

        return sum;
    }
}