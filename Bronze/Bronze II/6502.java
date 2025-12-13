import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String input = "";
        int cnt = 1;

        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input);

            int r = Integer.parseInt(st.nextToken());
            if (r == 0) {
                break;
            }

            int w = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            if (r * 2 >= Math.sqrt(w * w + l * l)) {
                sb.append("Pizza ").append(cnt).append(" fits on the table.").append("\n");
            } else {
                sb.append("Pizza ").append(cnt).append(" does not fit on the table.").append("\n");
            }

            cnt++;
        }

        System.out.println(sb);
    }
}