import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int answer = 0, x, y;

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            sb.append(0);
        } else {
            st = new StringTokenizer(br.readLine());

            int nowX = Integer.parseInt(st.nextToken());
            int nowY = Integer.parseInt(st.nextToken());

            for (int i = 0; i < N - 1; i++) {
                st = new StringTokenizer(br.readLine());

                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());

                answer += Math.abs(nowX - x) + Math.abs(nowY - y);

                nowX = x;
                nowY = y;
            }

            sb.append(answer);
        }

        System.out.println(sb);
    }
}