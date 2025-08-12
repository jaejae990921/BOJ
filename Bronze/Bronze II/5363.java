import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String one = "", two = "";

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            one = st.nextToken();
            two = st.nextToken();

            while (st.hasMoreTokens()) {
                sb.append(st.nextToken()).append(" ");
            }

            sb.append(one).append(" ").append(two).append("\n");
        }

        System.out.println(sb);
    }
}