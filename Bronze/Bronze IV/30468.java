import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int stat = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            stat += Integer.parseInt(st.nextToken());
        }

        int N = Integer.parseInt(st.nextToken());
        int answer = (N * 4) - stat < 0 ? 0 : (N * 4) - stat;

        sb.append(answer);
        System.out.println(sb);
    }
}