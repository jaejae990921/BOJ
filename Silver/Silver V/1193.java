import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0, i = 1;

        int X = Integer.parseInt(br.readLine());

        for (int j = 1; j <= X; j++) {
            sum += j;
            if (sum >= X) {
                i = j;
                break;
            }
        }

        if (i % 2 == 0) {
            sb.append((i - (sum - X)) + "/" + (1 + (sum - X)));
        } else {
            sb.append((1 + (sum - X)) + "/" + (i - (sum - X)));
        }

        System.out.println(sb);
    }
}