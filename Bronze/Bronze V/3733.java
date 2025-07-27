import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String input;
        int N, S;

        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input);

            N = Integer.parseInt(st.nextToken());
            S = Integer.parseInt(st.nextToken());

            sb.append(S / (N + 1)).append("\n");
        }

        System.out.println(sb);
    }
}