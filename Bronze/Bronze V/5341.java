import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        int num = 0;

        while ((input = br.readLine()) != null) {
            num = Integer.parseInt(input.trim());

            if (num == 0) {
                break;
            }

            sb.append(getSum(num)).append("\n");
        }

        System.out.println(sb);
    }

    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }
}