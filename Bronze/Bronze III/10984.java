import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N, sum, C;
        double avg, G;

        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            sum = 0;
            avg = 0;

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());

                C = Integer.parseInt(st.nextToken());
                G = Double.parseDouble(st.nextToken());

                sum += C;
                avg += C * G;
            }

            sb.append(sum).append(" ").append(String.format("%.1f", avg / sum)).append("\n");
        }

        System.out.println(sb);
    }
}