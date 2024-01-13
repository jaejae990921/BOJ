import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String str;

        for (int i = 0; i < N; i++) {
            str = br.readLine();

            for (int j = 0; j < M; j++) {
                sb.append(str.charAt(M - j - 1));
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}