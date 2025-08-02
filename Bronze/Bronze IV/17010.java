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
        int repeat;

        int L = Integer.parseInt(br.readLine());

        for (int i = 0; i < L; i++) {
            st = new StringTokenizer(br.readLine());

            repeat = Integer.parseInt(st.nextToken());
            input = st.nextToken();

            sb.append(input.repeat(repeat)).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}