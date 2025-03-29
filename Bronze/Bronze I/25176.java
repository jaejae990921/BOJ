import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        sb.append(cal(N));
        System.out.println(sb);
    }

    public static int cal(int n) {
        if (n > 0) {
            return n * cal(n - 1);
        } else {
            return 1;
        }
    }
}