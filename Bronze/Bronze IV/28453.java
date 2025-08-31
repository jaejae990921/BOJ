import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int num = 0;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());

            if (num == 300) {
                sb.append(1);
            } else if (num >= 275) {
                sb.append(2);
            } else if (num >= 250) {
                sb.append(3);
            } else {
                sb.append(4);
            }

            sb.append(" ");
        }

        System.out.println(sb);
    }
}