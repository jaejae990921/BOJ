import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N, M, sMax = 0, bMax = 0;
        String temp;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            temp = br.readLine();
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            sMax = 0;
            bMax = 0;

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                sMax = Math.max(sMax, Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                bMax = Math.max(bMax, Integer.parseInt(st.nextToken()));
            }

            sb.append(sMax >= bMax ? "S" : "B").append("\n");
        }

        System.out.println(sb);
    }
}