import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            cnt += Integer.parseInt(st.nextToken());
        }

        if (cnt > 0) {
            sb.append("Right");
        } else if (cnt < 0) {
            sb.append("Left");
        } else {
            sb.append("Stay");
        }

        System.out.println(sb);
    }
}