import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String code = "";
        int cnt = 0;

        String retake = br.readLine().substring(0, 5);
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            code = br.readLine().substring(0, 5);

            if (code.equals(retake)) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}