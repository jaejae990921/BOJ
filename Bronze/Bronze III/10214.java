import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int yonsei = 0, korea = 0;

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            yonsei = 0;
            korea = 0;

            for (int j = 0; j < 9; j++) {
                st = new StringTokenizer(br.readLine());

                yonsei += Integer.parseInt(st.nextToken());
                korea += Integer.parseInt(st.nextToken());
            }

            sb.append(yonsei > korea ? "Yonsei" : yonsei < korea ? "Korea" : "Draw").append("\n");
        }

        System.out.println(sb);
    }
}