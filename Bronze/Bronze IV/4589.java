import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int a, b, c;
        String answer = "";

        sb.append("Gnomes:").append("\n");

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if (a < b && b < c || c < b && b < a) {
                answer = "Ordered";
            } else {
                answer = "Unordered";
            }

            sb.append(answer).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}