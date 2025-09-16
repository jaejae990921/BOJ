import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input;
        int date, cnt = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            input = br.readLine().split("-");
            date = Integer.parseInt(input[1]);

            if (date <= 90) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}