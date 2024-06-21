import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        if (N % 8 == 0) {
            sb.append(2);
        } else if (N % 4 == 3) {
            sb.append(3);
        } else if (N % 8 == 6) {
            sb.append(4);
        } else {
            sb.append(N % 8);
        }

        System.out.println(sb);
    }
}