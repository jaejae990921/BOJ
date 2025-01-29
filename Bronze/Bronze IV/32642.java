import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long answer = 0;
        int angry = 0, tmp;

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            tmp = Integer.parseInt(st.nextToken());

            if (tmp == 1) {
                angry++;
            } else {
                angry--;
            }

            answer += angry;
        }

        sb.append(answer);
        System.out.println(sb);
    }
}